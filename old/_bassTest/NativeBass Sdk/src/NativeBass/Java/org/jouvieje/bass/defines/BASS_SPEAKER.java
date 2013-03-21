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
 * Speaker assignment flags [NAME] BASS_SPEAKER
 */
public interface BASS_SPEAKER
{
	/** front speakers */
	public static final int BASS_SPEAKER_FRONT = 0x1000000;
	/** rear/side speakers */
	public static final int BASS_SPEAKER_REAR = 0x2000000;
	/** center & LFE speakers (5.1) */
	public static final int BASS_SPEAKER_CENLFE = 0x3000000;
	/** rear center speakers (7.1) */
	public static final int BASS_SPEAKER_REAR2 = 0x4000000;
	/** modifier: left */
	public static final int BASS_SPEAKER_LEFT = 0x10000000;
	/** modifier: right */
	public static final int BASS_SPEAKER_RIGHT = 0x20000000;
	/**  */
	public static final int BASS_SPEAKER_FRONTLEFT = BASS_SPEAKER_FRONT|BASS_SPEAKER_LEFT;
	/**  */
	public static final int BASS_SPEAKER_FRONTRIGHT = BASS_SPEAKER_FRONT|BASS_SPEAKER_RIGHT;
	/**  */
	public static final int BASS_SPEAKER_REARLEFT = BASS_SPEAKER_REAR|BASS_SPEAKER_LEFT;
	/**  */
	public static final int BASS_SPEAKER_REARRIGHT = BASS_SPEAKER_REAR|BASS_SPEAKER_RIGHT;
	/**  */
	public static final int BASS_SPEAKER_CENTER = BASS_SPEAKER_CENLFE|BASS_SPEAKER_LEFT;
	/**  */
	public static final int BASS_SPEAKER_LFE = BASS_SPEAKER_CENLFE|BASS_SPEAKER_RIGHT;
	/**  */
	public static final int BASS_SPEAKER_REAR2LEFT = BASS_SPEAKER_REAR2|BASS_SPEAKER_LEFT;
	/**  */
	public static final int BASS_SPEAKER_REAR2RIGHT = BASS_SPEAKER_REAR2|BASS_SPEAKER_RIGHT;
	/**  */
	public static final int BASS_SPEAKER_5 = 5<<24;
	/**  */
	public static final int BASS_SPEAKER_6 = 6<<24;
	/**  */
	public static final int BASS_SPEAKER_7 = 7<<24;
	/**  */
	public static final int BASS_SPEAKER_8 = 8<<24;
	/**  */
	public static final int BASS_SPEAKER_9 = 9<<24;
	/**  */
	public static final int BASS_SPEAKER_10 = 10<<24;
	/**  */
	public static final int BASS_SPEAKER_11 = 11<<24;
	/**  */
	public static final int BASS_SPEAKER_12 = 12<<24;
	/**  */
	public static final int BASS_SPEAKER_13 = 13<<24;
	/**  */
	public static final int BASS_SPEAKER_14 = 14<<24;
	/**  */
	public static final int BASS_SPEAKER_15 = 15<<24;
}