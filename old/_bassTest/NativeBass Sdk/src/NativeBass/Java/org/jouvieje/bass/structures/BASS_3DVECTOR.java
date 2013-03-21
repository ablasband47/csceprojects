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

/**
 * 3D vector (for 3D positions/velocities/orientations)
 */
public class BASS_3DVECTOR extends Pointer
{
	/**
	 * Create a new <code>BASS_3DVECTOR</code>.<br>
	 * The call <code>isNull()</code> on the object created will return false.<br>
	 * <pre><code>  BASS_3DVECTOR obj = BASS_3DVECTOR.create();
	 *  (obj == null) <=> obj.isNull() <=> false
	 * </code></pre>
	 * @param x X co-ordinate in 3D space.
	 * @param y Y co-ordinate in 3D space.
	 * @param z Z co-ordinate in 3D space.
	 */
	public static BASS_3DVECTOR create(float x, float y, float z)
	{
		return new BASS_3DVECTOR(StructureJNI.BASS_3DVECTOR_create(x, y, z));
	}

	/**
	 * Create a view of the <code>Pointer</code> object as a <code>BASS_3DVECTOR</code> object.<br>
	 * This view is valid only if the memory holded by the <code>Pointer</code> holds a BASS_3DVECTOR object.
	 */
	public static BASS_3DVECTOR createView(Pointer pointer)
	{
		return new BASS_3DVECTOR(Pointer.getPointer(pointer));
	}
	/**
	 * Create a new <code>BASS_3DVECTOR</code>.<br>
	 * The call <code>isNull()</code> on the object created will return false.<br>
	 * <pre><code>  BASS_3DVECTOR obj = BASS_3DVECTOR.create();
	 *  (obj == null) <=> obj.isNull() <=> false
	 * </code></pre>
	 */
	public static BASS_3DVECTOR create()
	{
		return new BASS_3DVECTOR(StructureJNI.BASS_3DVECTOR_new());
	}

	protected BASS_3DVECTOR(long pointer)
	{
		super(pointer);
	}

	/**
	 * Create an object that holds a null <code>BASS_3DVECTOR</code>.<br>
	 * The call <code>isNull()</code> on the object created will returns true.<br>
	 * <pre><code>  BASS_3DVECTOR obj = new BASS_3DVECTOR();
	 *  (obj == null) <=> false
	 *  obj.isNull() <=> true
	 * </code></pre>
	 * To creates a new <code>BASS_3DVECTOR</code>, use the static "constructor" :
	 * <pre><code>  BASS_3DVECTOR obj = BASS_3DVECTOR.create();</code></pre>
	 * @see BASS_3DVECTOR#create()
	 */
	public BASS_3DVECTOR()
	{
		super();
	}

	public void release()
	{
		if(pointer != 0)
		{

			StructureJNI.BASS_3DVECTOR_delete(pointer);
		}
		pointer = 0;
	}

	/**
	 * 
	 */
	public float getX()
	{
		if(pointer == 0) throw new NullPointerException();
		float javaResult = StructureJNI.BASS_3DVECTOR_get_x(pointer);
		return javaResult;
	}
	public void setX(float x)
	{
		if(pointer == 0) throw new NullPointerException();
		StructureJNI.BASS_3DVECTOR_set_x(pointer, x);
	}

	/**
	 * 
	 */
	public float getY()
	{
		if(pointer == 0) throw new NullPointerException();
		float javaResult = StructureJNI.BASS_3DVECTOR_get_y(pointer);
		return javaResult;
	}
	public void setY(float y)
	{
		if(pointer == 0) throw new NullPointerException();
		StructureJNI.BASS_3DVECTOR_set_y(pointer, y);
	}

	/**
	 * 
	 */
	public float getZ()
	{
		if(pointer == 0) throw new NullPointerException();
		float javaResult = StructureJNI.BASS_3DVECTOR_get_z(pointer);
		return javaResult;
	}
	public void setZ(float z)
	{
		if(pointer == 0) throw new NullPointerException();
		StructureJNI.BASS_3DVECTOR_set_z(pointer, z);
	}

	/**
	 * X, Y & Z co-ordinate in 3D space.
	 */
	public void setXYZ(BASS_3DVECTOR vector)
	{
		if(pointer == 0) throw new NullPointerException();
		StructureJNI.BASS_3DVECTOR_set_xyz(pointer, Pointer.getPointer(vector));
	}
	
	/**
	 * X, Y & Z co-ordinate in 3D space.
	 */
	public void setXYZ(float x, float y, float z)
	{
		if(pointer == 0) throw new NullPointerException();
		StructureJNI.BASS_3DVECTOR_set_xyz(pointer, x, y, z);
	}
}