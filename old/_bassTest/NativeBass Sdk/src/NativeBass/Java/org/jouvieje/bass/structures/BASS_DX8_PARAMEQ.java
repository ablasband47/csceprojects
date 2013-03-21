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

package org.jouvieje.bass.structures;

import org.jouvieje.bass.*;
import org.jouvieje.bass.exceptions.*;
import org.jouvieje.bass.callbacks.*;
import org.jouvieje.bass.*;
import org.jouvieje.bass.defines.*;
import org.jouvieje.bass.enumerations.*;
import org.jouvieje.bass.structures.*;
import java.nio.*;
import org.jouvieje.bass.*;
import org.jouvieje.bass.enumerations.*;
import org.jouvieje.bass.structures.*;
import org.jouvieje.bass.misc.*;

public class BASS_DX8_PARAMEQ extends Pointer
{
	/**
	 * Create a view of the <code>Pointer</code> object as a <code>BASS_DX8_PARAMEQ</code> object.<br>
	 * This view is valid only if the memory holded by the <code>Pointer</code> holds a BASS_DX8_PARAMEQ object.
	 */
	public static BASS_DX8_PARAMEQ createView(Pointer pointer)
	{
		return new BASS_DX8_PARAMEQ(Pointer.getPointer(pointer));
	}
	/**
	 * Create a new <code>BASS_DX8_PARAMEQ</code>.<br>
	 * The call <code>isNull()</code> on the object created will return false.<br>
	 * <pre><code>  BASS_DX8_PARAMEQ obj = BASS_DX8_PARAMEQ.create();
	 *  (obj == null) <=> obj.isNull() <=> false
	 * </code></pre>
	 */
	public static BASS_DX8_PARAMEQ create()
	{
		return new BASS_DX8_PARAMEQ(StructureJNI.BASS_DX8_PARAMEQ_new());
	}

	protected BASS_DX8_PARAMEQ(long pointer)
	{
		super(pointer);
	}

	/**
	 * Create an object that holds a null <code>BASS_DX8_PARAMEQ</code>.<br>
	 * The call <code>isNull()</code> on the object created will returns true.<br>
	 * <pre><code>  BASS_DX8_PARAMEQ obj = new BASS_DX8_PARAMEQ();
	 *  (obj == null) <=> false
	 *  obj.isNull() <=> true
	 * </code></pre>
	 * To creates a new <code>BASS_DX8_PARAMEQ</code>, use the static "constructor" :
	 * <pre><code>  BASS_DX8_PARAMEQ obj = BASS_DX8_PARAMEQ.create();</code></pre>
	 * @see BASS_DX8_PARAMEQ#create()
	 */
	public BASS_DX8_PARAMEQ()
	{
		super();
	}

	public void release()
	{
		if(pointer != 0)
		{

			StructureJNI.BASS_DX8_PARAMEQ_delete(pointer);
		}
		pointer = 0;
	}

	/**
	 * 
	 */
	public float getCenter()
	{
		if(pointer == 0) throw new NullPointerException();
		float javaResult = StructureJNI.BASS_DX8_PARAMEQ_get_fCenter(pointer);
		return javaResult;
	}
	public void setCenter(float center)
	{
		if(pointer == 0) throw new NullPointerException();
		StructureJNI.BASS_DX8_PARAMEQ_set_fCenter(pointer, center);
	}

	/**
	 * 
	 */
	public float getBandwidth()
	{
		if(pointer == 0) throw new NullPointerException();
		float javaResult = StructureJNI.BASS_DX8_PARAMEQ_get_fBandwidth(pointer);
		return javaResult;
	}
	public void setBandwidth(float bandwidth)
	{
		if(pointer == 0) throw new NullPointerException();
		StructureJNI.BASS_DX8_PARAMEQ_set_fBandwidth(pointer, bandwidth);
	}

	/**
	 * 
	 */
	public float getGain()
	{
		if(pointer == 0) throw new NullPointerException();
		float javaResult = StructureJNI.BASS_DX8_PARAMEQ_get_fGain(pointer);
		return javaResult;
	}
	public void setGain(float gain)
	{
		if(pointer == 0) throw new NullPointerException();
		StructureJNI.BASS_DX8_PARAMEQ_set_fGain(pointer, gain);
	}

}