/**
 * 						NativeBass Project
 *
 * Want to use BASS (www.un4seen.com) in the Java language ? NativeBass is made for you.
 * Copyright � 2007-2009 J�r�me JOUVIE (Jouvieje)
 *
 * Created on 02 jul. 2007
 * @version file v1.0.6
 * @author J�r�me JOUVIE (Jouvieje)
 * 
 * 
 * WANT TO CONTACT ME ?
 * E-mail :
 * 		jerome.jouvie@gmail.com
 * My web sites :
 * 		http://jerome.jouvie.free.fr/
 * 
 * 
 * INTRODUCTION
 * BASS is an audio library for use in Windows and Mac OSX software.
 * Its purpose is to provide developers with the most powerful and
 * efficient (yet easy to use), sample, stream (MP3, MP2, MP1, OGG, WAV, AIFF,
 * custom generated, and more via add-ons), MOD music (XM, IT, S3M, MOD, MTM, UMX),
 * MO3 music (MP3/OGG compressed MODs),
 * and recording functions. All in a tiny DLL, under 100KB* in size.
 * 
 * BASS official web site :
 * 		http://www.un4seen.com/
 * 
 * 
 * GNU LESSER GENERAL PUBLIC LICENSE
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1 of the License,
 * or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the
 * Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307 USA 
 */

package org.jouvieje.bass.defines;

/**
 * BASS_SetConfig options [NAME] BASS_CONFIG
 */
public interface BASS_CONFIG
{
	/**  */
	public static final int BASS_CONFIG_BUFFER = 0;
	/**  */
	public static final int BASS_CONFIG_UPDATEPERIOD = 1;
	/**  */
	public static final int BASS_CONFIG_GVOL_SAMPLE = 4;
	/**  */
	public static final int BASS_CONFIG_GVOL_STREAM = 5;
	/**  */
	public static final int BASS_CONFIG_GVOL_MUSIC = 6;
	/**  */
	public static final int BASS_CONFIG_CURVE_VOL = 7;
	/**  */
	public static final int BASS_CONFIG_CURVE_PAN = 8;
	/**  */
	public static final int BASS_CONFIG_FLOATDSP = 9;
	/**  */
	public static final int BASS_CONFIG_3DALGORITHM = 10;
	/**  */
	public static final int BASS_CONFIG_NET_TIMEOUT = 11;
	/**  */
	public static final int BASS_CONFIG_NET_BUFFER = 12;
	/**  */
	public static final int BASS_CONFIG_PAUSE_NOPLAY = 13;
	/**  */
	public static final int BASS_CONFIG_NET_PREBUF = 15;
	/**  */
	public static final int BASS_CONFIG_NET_PASSIVE = 18;
	/**  */
	public static final int BASS_CONFIG_REC_BUFFER = 19;
	/**  */
	public static final int BASS_CONFIG_NET_PLAYLIST = 21;
	/**  */
	public static final int BASS_CONFIG_MUSIC_VIRTUAL = 22;
	/**  */
	public static final int BASS_CONFIG_VERIFY = 23;
	/**  */
	public static final int BASS_CONFIG_UPDATETHREADS = 24;
}