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
 * [NAME] BASS_INPUT_TYPE
 */
public interface BASS_INPUT_TYPE
{
	/**  */
	public static final int BASS_INPUT_TYPE_MASK = 0xff000000;
	/**  */
	public static final int BASS_INPUT_TYPE_UNDEF = 0x00000000;
	/**  */
	public static final int BASS_INPUT_TYPE_DIGITAL = 0x01000000;
	/**  */
	public static final int BASS_INPUT_TYPE_LINE = 0x02000000;
	/**  */
	public static final int BASS_INPUT_TYPE_MIC = 0x03000000;
	/**  */
	public static final int BASS_INPUT_TYPE_SYNTH = 0x04000000;
	/**  */
	public static final int BASS_INPUT_TYPE_CD = 0x05000000;
	/**  */
	public static final int BASS_INPUT_TYPE_PHONE = 0x06000000;
	/**  */
	public static final int BASS_INPUT_TYPE_SPEAKER = 0x07000000;
	/**  */
	public static final int BASS_INPUT_TYPE_WAVE = 0x08000000;
	/**  */
	public static final int BASS_INPUT_TYPE_AUX = 0x09000000;
	/**  */
	public static final int BASS_INPUT_TYPE_ANALOG = 0x0a000000;
}