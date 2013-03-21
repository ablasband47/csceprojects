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

package org.jouvieje.bass.enumerations;

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
import java.util.HashMap;

/**
 * special STREAMPROCs [NAME] STREAMPROC_SPECIAL
 */
public class STREAMPROC_SPECIAL implements Enumeration, Comparable
{
	/**  */
	public final static STREAMPROC_SPECIAL STREAMPROC_DUMMY = new STREAMPROC_SPECIAL("STREAMPROC_DUMMY", 0x00000000);
	/** push stream */
	public final static STREAMPROC_SPECIAL STREAMPROC_PUSH = new STREAMPROC_SPECIAL("STREAMPROC_PUSH", 0xFFFFFFFF);

	private final static HashMap VALUES = new HashMap(2*2);
	static
	{
		VALUES.put(new Integer(STREAMPROC_DUMMY.asInt()), STREAMPROC_DUMMY);
		VALUES.put(new Integer(STREAMPROC_PUSH.asInt()), STREAMPROC_PUSH);
	}

	private final String name;
	private final int nativeValue;
	private STREAMPROC_SPECIAL(String name, int nativeValue)
	{
		this.name = name;
		this.nativeValue = nativeValue;
	}

	public int asInt()
	{
		return nativeValue;
	}
	public String toString()
	{
		return name;
	}
	public boolean equals(Object object)
	{
		if(object instanceof STREAMPROC_SPECIAL)
			return asInt() == ((STREAMPROC_SPECIAL)object).asInt();
		return false;
	}
	public int compareTo(Object object)
	{
		return asInt() - ((STREAMPROC_SPECIAL)object).asInt();
	}


	/**
	 * Retrieve a STREAMPROC_SPECIAL enum field with his integer value
	 * @param nativeValue the integer value of the field to retrieve
	 * @return the STREAMPROC_SPECIAL enum field that correspond to the integer value
	 */
	public static STREAMPROC_SPECIAL get(int nativeValue)
	{
		return (STREAMPROC_SPECIAL)VALUES.get(new Integer(nativeValue));
	}

	/**
	 * Retrieve a STREAMPROC_SPECIAL enum field from a Pointer
	 * @param pointer a pointer holding an STREAMPROC_SPECIAL enum field
	 * @return the STREAMPROC_SPECIAL enum field that correspond to the enum field in the pointer
	 */
	public static STREAMPROC_SPECIAL get(Pointer pointer)
	{
		return get(pointer.asInt());
	}

	/**
	 * @return an <code>Iterator</code> over the elements in this enumeration.<BR>
	 * Can be cast to <code>Iterator<STREAMPROC_SPECIAL></code> in Java 1.5.
	 */
	public static java.util.Iterator iterator()
	{
		return new java.util.Iterator(){
			private java.util.Iterator i = VALUES.values().iterator();	//Wrapper of the HashMap iterator
			public boolean hasNext() { return i.hasNext(); }
			public Object next() { return i.next(); }
			public void remove() { throw new UnsupportedOperationException(); }
		};
	}
}