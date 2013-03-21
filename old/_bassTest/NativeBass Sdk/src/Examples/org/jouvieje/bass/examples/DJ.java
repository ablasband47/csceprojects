// BASS spectrum analyser example, copyright (c) 2002-2006 Ian Luck.

package org.jouvieje.bass.examples;

import static org.jouvieje.bass.Bass.*;
import static org.jouvieje.bass.defines.BASS_MUSIC.BASS_MUSIC_RAMP;
import static org.jouvieje.bass.defines.BASS_SAMPLE.BASS_SAMPLE_LOOP;
import static org.jouvieje.bass.defines.INIT_MODES.INIT_BASS;
import static org.jouvieje.bass.defines.VERSIONS.BASSVERSION;
import static org.jouvieje.bass.defines.VERSIONS.NATIVEBASS_JAR_VERSION;
import static org.jouvieje.bass.defines.VERSIONS.NATIVEBASS_LIBRARY_VERSION;

import static org.jouvieje.bass.examples.util.Device.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import org.jouvieje.bass.Init;
import org.jouvieje.bass.examples.util.BassExample;
import org.jouvieje.bass.examples.util.BassExampleFrame;
import org.jouvieje.bass.examples.util.FileFilters;
import org.jouvieje.bass.exceptions.InitException;
import org.jouvieje.bass.structures.HMUSIC;
import org.jouvieje.bass.structures.HSTREAM;

/**
 * I've ported the C BASS example to NativeBass.
 * 
 * @author J�r�me JOUVIE (Jouvieje)
 * 
 * WANT TO CONTACT ME ?
 * E-mail :
 * 		jerome.jouvie@gmail.com
 * My web sites :
 * 		http://topresult.tomato.co.uk/~jerome/
 * 		http://jerome.jouvie.free.fr/
 */
public class DJ extends SpectrumPanel implements BassExample
{
	/* display error messages */
	private final void error(String text) 
	{
		JOptionPane.showMessageDialog(DJ.this,
				"<html><body>"+text+"<BR>(error code: "+BASS_ErrorGetCode()+")</body></html>");
	}
	private final void printfExit(String format, Object ...args)
	{
		String s = String.format(format, args);
		JOptionPane.showMessageDialog(this, s);
		stop();
		try {
			System.exit(0);
		} catch(SecurityException e) {};
	}

	private boolean init   = false;
	private boolean deinit = false;
	
	private static final int SPECTRUM_WIDTH = 368;	//Display width
	private static final int SPECTRUM_HEIGHT = 127;	//Height (changing requires palette adjustments too)

	private int chan;

	public static void main(String[] args)
	{
		new BassExampleFrame(new Spectrum());
	}

	private void initBass()
	{
		/*
		 * NativeBass Init
		 */
		try
		{
			Init.loadLibraries(INIT_BASS);
		}
		catch(InitException e)
		{
			printfExit("NativeBass error! %s\n", e.getMessage());
			return;
		}
		
		/*
		 * Checking NativeBass version
		 */
		if(NATIVEBASS_LIBRARY_VERSION != NATIVEBASS_JAR_VERSION)
		{
			printfExit("Error!  NativeBass library version (%08x) is different to jar version (%08x)\n",
					NATIVEBASS_LIBRARY_VERSION, NATIVEBASS_JAR_VERSION);
			return;
		}
		
		/*==================================================*/
	    
		init = true;
	}

	public void run()
	{
		if(!init) return;
		
		// check the correct BASS was loaded
		if(((BASS_GetVersion() & 0xFFFF0000) >> 16) != BASSVERSION)
		{
			printfExit("An incorrect version of BASS.DLL was loaded");
			return;
		}
		
		// initialize BASS
		if(!BASS_Init(forceNoSoundDevice(-1), forceFrequency(44100), 0, null, null))
		{
			error("Can't initialize device");
			stop();
			return;
		}
		if(!playFile())
		{
			// start a file playing
			BASS_Free();
			stop();
			return;
		}
		// setup update timer (40hz)
		timer.start();
	}

	public void stop()
	{
		if(!init || deinit) return;
		deinit = true;
		
		timer.stop();
		BASS_Free();
	}

	private boolean playFile()
	{
		int result = getFileChooser().showOpenDialog(DJ.this);
		if(result != JFileChooser.APPROVE_OPTION) return false;

		String file = getFileChooser().getSelectedFile().getPath();
		HSTREAM stream = null; HMUSIC music = null;
		if(    (stream = BASS_StreamCreateFile(false, file, 0, 0, BASS_SAMPLE_LOOP)) == null
				&& (music = BASS_MusicLoad(false, file, 0, 0, BASS_MUSIC_RAMP | BASS_SAMPLE_LOOP, 0)) == null)
		{
			error("Can't play file");
			return false; // Can't load the file
		}

		chan = (stream != null) ? stream.asInt() : ((music != null) ?  music.asInt() : 0);

		BASS_ChannelPlay(chan, false);
		return true;
	}
	
	public JPanel getPanel() { return this; }
	public String getTitle() { return "BASS spectrum example (click to toggle mode)"; }

	/* Graphical stuff */

	private JFileChooser fileChooser = null;
	private Timer timer = new Timer(25, new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
			/* update the spectrum display - the interesting bit :) */
			update(chan);
		}
	});

	public DJ()
	{
		super(SPECTRUM_WIDTH, SPECTRUM_HEIGHT);
		initBass();
	}
	private JFileChooser getFileChooser()
	{
		if(fileChooser == null)
		{
			fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File("."));
			fileChooser.setMultiSelectionEnabled(false);
			fileChooser.resetChoosableFileFilters();
			fileChooser.addChoosableFileFilter(FileFilters.allFiles);
			fileChooser.addChoosableFileFilter(FileFilters.playableFiles);
			fileChooser.setDialogTitle("Open a music");
		}
		return fileChooser;
	}
}