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
 * BASS_CHANNELINFO types [NAME] BASS_CTYPE
 */
public interface BASS_CTYPE
{
	/**  */
	public static final int BASS_CTYPE_SAMPLE = 1;
	/**  */
	public static final int BASS_CTYPE_RECORD = 2;
	/**  */
	public static final int BASS_CTYPE_STREAM = 0x10000;
	/**  */
	public static final int BASS_CTYPE_STREAM_OGG = 0x10002;
	/**  */
	public static final int BASS_CTYPE_STREAM_MP1 = 0x10003;
	/**  */
	public static final int BASS_CTYPE_STREAM_MP2 = 0x10004;
	/**  */
	public static final int BASS_CTYPE_STREAM_MP3 = 0x10005;
	/**  */
	public static final int BASS_CTYPE_STREAM_AIFF = 0x10006;
	/** WAVE flag, LOWORD=codec */
	public static final int BASS_CTYPE_STREAM_WAV = 0x40000;
	/**  */
	public static final int BASS_CTYPE_STREAM_WAV_PCM = 0x50001;
	/**  */
	public static final int BASS_CTYPE_STREAM_WAV_FLOAT = 0x50003;
	/**  */
	public static final int BASS_CTYPE_MUSIC_MOD = 0x20000;
	/**  */
	public static final int BASS_CTYPE_MUSIC_MTM = 0x20001;
	/**  */
	public static final int BASS_CTYPE_MUSIC_S3M = 0x20002;
	/**  */
	public static final int BASS_CTYPE_MUSIC_XM = 0x20003;
	/**  */
	public static final int BASS_CTYPE_MUSIC_IT = 0x20004;
	/** MO3 flag */
	public static final int BASS_CTYPE_MUSIC_MO3 = 0x00100;
}