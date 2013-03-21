// BASS Simple Console Test, copyright (c) 1999-2006 Ian Luck.

package org.jouvieje.bass.examples;

import static org.jouvieje.bass.Bass.*;
import static org.jouvieje.bass.defines.BASS_ACTIVE.BASS_ACTIVE_STALLED;
import static org.jouvieje.bass.defines.BASS_ACTIVE.BASS_ACTIVE_STOPPED;
import static org.jouvieje.bass.defines.BASS_ATTRIB.BASS_ATTRIB_FREQ;
import static org.jouvieje.bass.defines.BASS_ATTRIB.BASS_ATTRIB_MUSIC_VOL_CHAN;
import static org.jouvieje.bass.defines.BASS_ATTRIB.BASS_ATTRIB_VOL;
import static org.jouvieje.bass.defines.BASS_FILEPOS.BASS_FILEPOS_BUFFER;
import static org.jouvieje.bass.defines.BASS_FILEPOS.BASS_FILEPOS_DOWNLOAD;
import static org.jouvieje.bass.defines.BASS_MUSIC.BASS_MUSIC_PRESCAN;
import static org.jouvieje.bass.defines.BASS_MUSIC.BASS_MUSIC_RAMPS;
import static org.jouvieje.bass.defines.BASS_POS.BASS_POS_BYTE;
import static org.jouvieje.bass.defines.BASS_POS.BASS_POS_MUSIC_ORDER;
import static org.jouvieje.bass.defines.BASS_SAMPLE.BASS_SAMPLE_LOOP;
import static org.jouvieje.bass.defines.BASS_TAG.BASS_TAG_MUSIC_NAME;
import static org.jouvieje.bass.defines.INIT_MODES.INIT_BASS;
import static org.jouvieje.bass.defines.VERSIONS.BASSVERSION;
import static org.jouvieje.bass.defines.VERSIONS.NATIVEBASS_JAR_VERSION;
import static org.jouvieje.bass.defines.VERSIONS.NATIVEBASS_LIBRARY_VERSION;

import static org.jouvieje.bass.examples.util.Device.*;

import javax.swing.JPanel;

import org.jouvieje.bass.Init;
import org.jouvieje.bass.examples.util.BassExampleFrame;
import org.jouvieje.bass.examples.util.ConsoleGUI;
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
public class ConTest extends ConsoleGUI
{
	public static void main(String[] args)
	{
		new BassExampleFrame(new ConTest());
	}
	
	private boolean init   = false;
	private boolean deinit = false;
	
	public ConTest()
	{
		super();
		initBass();
		initialize();
	}
	
	public JPanel getPanel() { return this; }
	public String getTitle() { return "BASS Simple Console Test"; }
	
	public void initBass()
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
		
		HSTREAM stream = null;
		int chan;
		long act,time,level;
		boolean ismod;
		long pos;
		
		printf( "Simple console mode BASS example : MOD/MPx/OGG/WAV player\n"+
				"---------------------------------------------------------\n"+
				"Usage:    ConTest <file>\n"+
				"Examples: ConTest music.mp3");
		
		resetInput();
		setInput("music.mp3");
		while(!keyHit()) {
			Thread.yield();
		}
		String path = getInput();

		// check the correct BASS was loaded
		if(((BASS_GetVersion() & 0xFFFF0000) >> 16) != BASSVERSION)
		{
			printfExit("An incorrect version of BASS.DLL was loaded");
		}
		
		// setup output - default device
		if(!BASS_Init(forceNoSoundDevice(-1), forceFrequency(44100), 0, null, null)) {
			printExit("Can't initialize device");
			return;
		}
		
		// try streaming the file/url
		if(    (stream = BASS_StreamCreateFile(false, path, 0, 0, BASS_SAMPLE_LOOP)) != null
			|| (stream = BASS_StreamCreateURL(path, 0, BASS_SAMPLE_LOOP, null, null)) != null)
		{
			chan = stream.asInt();
			
			pos = BASS_ChannelGetLength(chan, BASS_POS_BYTE);
			if(BASS_StreamGetFilePosition(stream, BASS_FILEPOS_DOWNLOAD)!=-1)
			{
				// streaming from the internet
				if(pos!=-1)
					printf("streaming internet file [%d bytes]", pos);
				else
					printf("streaming internet file");
			}
			else
				printf("streaming file [%d bytes]", pos);
			ismod = false;
		}
		else
		{
			HMUSIC music = null;
			
			// try loading the MOD (with looping, sensitive ramping, and calculate the duration)
			if((music = BASS_MusicLoad(false, path, 0, 0, BASS_SAMPLE_LOOP|BASS_MUSIC_RAMPS|BASS_MUSIC_PRESCAN, 0)) == null)
			{
				// not a MOD either
				printExit("Can't play the file");
				return;
			}
			chan = music.asInt();
			
			int chans = 0;
			for(chans = 0; BASS_ChannelGetAttribute(chan, BASS_ATTRIB_MUSIC_VOL_CHAN+chans, null); chans++);		//count channels
			printf("playing MOD music \"%s\" [%d chans, %d orders]",
				BASS_ChannelGetTags(chan, BASS_TAG_MUSIC_NAME), chans, BASS_ChannelGetLength(chan, BASS_POS_MUSIC_ORDER));
			
			pos = BASS_ChannelGetLength(chan, BASS_POS_BYTE);
			ismod = true;
		}
		
		// display the time length
		if (pos!=-1) {
			time = (int)BASS_ChannelBytes2Seconds(chan, pos);
			printf(" %d:%02d\n", time/60, time%60);
		}
		else // no time length available
			printf("\n");

		BASS_ChannelPlay(chan, false);

		while(!keyHit() && (act = BASS_ChannelIsActive(chan)) != BASS_ACTIVE_STOPPED)
		{
			StringBuilder sb = new StringBuilder(80);
			
			// display some stuff and wait a bit
			level = BASS_ChannelGetLevel(chan);
			pos = BASS_ChannelGetPosition(chan, BASS_POS_BYTE);
			time = (int)BASS_ChannelBytes2Seconds(chan, pos);
			sb.append(String.format("pos %09d", pos));
			if(ismod)
			{
				pos = BASS_ChannelGetPosition(chan, BASS_POS_MUSIC_ORDER);
				sb.append(String.format(" (%03d:%03d)", (pos & 0x0000FFFF), (pos & 0xFFFF0000) >> 16));
			}
			sb.append(String.format(" - %d:%02d - L ", time/60, time%60));
			if(act == BASS_ACTIVE_STALLED)
			{
				// playback has stalled
				sb.append(String.format("-- buffering : %05d --", BASS_StreamGetFilePosition(stream, BASS_FILEPOS_BUFFER)));
			}
			else
			{
				for(int a = 27204; a > 200; a = a*2/3) {
					sb.append((level & 0x0000FFFF) >= a ? '*' : '-');
				}
				sb.append(' ');
				for(int a = 210; a < 32768; a = a*3/2) {
					sb.append(((level & 0xFFFF0000) >> 16) >= a ? '*' : '-');
				}
			}
			sb.append(String.format(" R - cpu %.2f%%", BASS_GetCPU()));
			
			printr(sb.toString());
			sleep(50);
		}
		
		print("\n");

		// wind the frequency down...
		BASS_ChannelSlideAttribute(chan, BASS_ATTRIB_FREQ, 1000, 500);
		sleep(300);
		// ...and fade-out to avoid a "click"
		BASS_ChannelSlideAttribute(chan, BASS_ATTRIB_VOL, -1, 200);
		while(BASS_ChannelIsSliding(chan, 0)) {
			sleep(1);
		}

		stop();
	}
	
	public void stop()
	{
		if(!init || deinit) return;
		deinit = true;
		
		print("\n");
		
		BASS_Free();
		
		printExit("Shutdown\n");
	}
	
	private static void sleep(int t)
	{
		try {
			Thread.sleep(t);
		} catch(InterruptedException e) {}
	}
}