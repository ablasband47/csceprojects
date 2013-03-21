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
 * Channel attributes [NAME] BASS_ATTRIB
 */
public interface BASS_ATTRIB
{
	/**  */
	public static final int BASS_ATTRIB_FREQ = 1;
	/**  */
	public static final int BASS_ATTRIB_VOL = 2;
	/**  */
	public static final int BASS_ATTRIB_PAN = 3;
	/**  */
	public static final int BASS_ATTRIB_EAXMIX = 4;
	/**  */
	public static final int BASS_ATTRIB_MUSIC_AMPLIFY = 0x100;
	/**  */
	public static final int BASS_ATTRIB_MUSIC_PANSEP = 0x101;
	/**  */
	public static final int BASS_ATTRIB_MUSIC_PSCALER = 0x102;
	/**  */
	public static final int BASS_ATTRIB_MUSIC_BPM = 0x103;
	/**  */
	public static final int BASS_ATTRIB_MUSIC_SPEED = 0x104;
	/**  */
	public static final int BASS_ATTRIB_MUSIC_VOL_GLOBAL = 0x105;
	/** + channel # */
	public static final int BASS_ATTRIB_MUSIC_VOL_CHAN = 0x200;
	/** + instrument # */
	public static final int BASS_ATTRIB_MUSIC_VOL_INST = 0x300;
}