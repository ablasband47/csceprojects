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
 * EAX environments, use with BASS_SetEAXParameters [NAME] EAX_ENVIRONMENT
 */
public class EAX_ENVIRONMENT implements Enumeration, Comparable
{
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_GENERIC = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_GENERIC", EnumerationJNI.get_EAX_ENVIRONMENT_GENERIC());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_PADDEDCELL = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_PADDEDCELL", EnumerationJNI.get_EAX_ENVIRONMENT_PADDEDCELL());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_ROOM = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_ROOM", EnumerationJNI.get_EAX_ENVIRONMENT_ROOM());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_BATHROOM = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_BATHROOM", EnumerationJNI.get_EAX_ENVIRONMENT_BATHROOM());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_LIVINGROOM = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_LIVINGROOM", EnumerationJNI.get_EAX_ENVIRONMENT_LIVINGROOM());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_STONEROOM = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_STONEROOM", EnumerationJNI.get_EAX_ENVIRONMENT_STONEROOM());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_AUDITORIUM = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_AUDITORIUM", EnumerationJNI.get_EAX_ENVIRONMENT_AUDITORIUM());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_CONCERTHALL = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_CONCERTHALL", EnumerationJNI.get_EAX_ENVIRONMENT_CONCERTHALL());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_CAVE = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_CAVE", EnumerationJNI.get_EAX_ENVIRONMENT_CAVE());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_ARENA = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_ARENA", EnumerationJNI.get_EAX_ENVIRONMENT_ARENA());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_HANGAR = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_HANGAR", EnumerationJNI.get_EAX_ENVIRONMENT_HANGAR());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_CARPETEDHALLWAY = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_CARPETEDHALLWAY", EnumerationJNI.get_EAX_ENVIRONMENT_CARPETEDHALLWAY());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_HALLWAY = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_HALLWAY", EnumerationJNI.get_EAX_ENVIRONMENT_HALLWAY());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_STONECORRIDOR = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_STONECORRIDOR", EnumerationJNI.get_EAX_ENVIRONMENT_STONECORRIDOR());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_ALLEY = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_ALLEY", EnumerationJNI.get_EAX_ENVIRONMENT_ALLEY());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_FOREST = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_FOREST", EnumerationJNI.get_EAX_ENVIRONMENT_FOREST());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_CITY = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_CITY", EnumerationJNI.get_EAX_ENVIRONMENT_CITY());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_MOUNTAINS = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_MOUNTAINS", EnumerationJNI.get_EAX_ENVIRONMENT_MOUNTAINS());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_QUARRY = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_QUARRY", EnumerationJNI.get_EAX_ENVIRONMENT_QUARRY());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_PLAIN = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_PLAIN", EnumerationJNI.get_EAX_ENVIRONMENT_PLAIN());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_PARKINGLOT = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_PARKINGLOT", EnumerationJNI.get_EAX_ENVIRONMENT_PARKINGLOT());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_SEWERPIPE = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_SEWERPIPE", EnumerationJNI.get_EAX_ENVIRONMENT_SEWERPIPE());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_UNDERWATER = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_UNDERWATER", EnumerationJNI.get_EAX_ENVIRONMENT_UNDERWATER());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_DRUGGED = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_DRUGGED", EnumerationJNI.get_EAX_ENVIRONMENT_DRUGGED());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_DIZZY = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_DIZZY", EnumerationJNI.get_EAX_ENVIRONMENT_DIZZY());
	/**  */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_PSYCHOTIC = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_PSYCHOTIC", EnumerationJNI.get_EAX_ENVIRONMENT_PSYCHOTIC());
	/** total number of environments */
	public final static EAX_ENVIRONMENT EAX_ENVIRONMENT_COUNT = new EAX_ENVIRONMENT("EAX_ENVIRONMENT_COUNT", EnumerationJNI.get_EAX_ENVIRONMENT_COUNT());

	private final static HashMap VALUES = new HashMap(2*27);
	static
	{
		VALUES.put(new Integer(EAX_ENVIRONMENT_GENERIC.asInt()), EAX_ENVIRONMENT_GENERIC);
		VALUES.put(new Integer(EAX_ENVIRONMENT_PADDEDCELL.asInt()), EAX_ENVIRONMENT_PADDEDCELL);
		VALUES.put(new Integer(EAX_ENVIRONMENT_ROOM.asInt()), EAX_ENVIRONMENT_ROOM);
		VALUES.put(new Integer(EAX_ENVIRONMENT_BATHROOM.asInt()), EAX_ENVIRONMENT_BATHROOM);
		VALUES.put(new Integer(EAX_ENVIRONMENT_LIVINGROOM.asInt()), EAX_ENVIRONMENT_LIVINGROOM);
		VALUES.put(new Integer(EAX_ENVIRONMENT_STONEROOM.asInt()), EAX_ENVIRONMENT_STONEROOM);
		VALUES.put(new Integer(EAX_ENVIRONMENT_AUDITORIUM.asInt()), EAX_ENVIRONMENT_AUDITORIUM);
		VALUES.put(new Integer(EAX_ENVIRONMENT_CONCERTHALL.asInt()), EAX_ENVIRONMENT_CONCERTHALL);
		VALUES.put(new Integer(EAX_ENVIRONMENT_CAVE.asInt()), EAX_ENVIRONMENT_CAVE);
		VALUES.put(new Integer(EAX_ENVIRONMENT_ARENA.asInt()), EAX_ENVIRONMENT_ARENA);
		VALUES.put(new Integer(EAX_ENVIRONMENT_HANGAR.asInt()), EAX_ENVIRONMENT_HANGAR);
		VALUES.put(new Integer(EAX_ENVIRONMENT_CARPETEDHALLWAY.asInt()), EAX_ENVIRONMENT_CARPETEDHALLWAY);
		VALUES.put(new Integer(EAX_ENVIRONMENT_HALLWAY.asInt()), EAX_ENVIRONMENT_HALLWAY);
		VALUES.put(new Integer(EAX_ENVIRONMENT_STONECORRIDOR.asInt()), EAX_ENVIRONMENT_STONECORRIDOR);
		VALUES.put(new Integer(EAX_ENVIRONMENT_ALLEY.asInt()), EAX_ENVIRONMENT_ALLEY);
		VALUES.put(new Integer(EAX_ENVIRONMENT_FOREST.asInt()), EAX_ENVIRONMENT_FOREST);
		VALUES.put(new Integer(EAX_ENVIRONMENT_CITY.asInt()), EAX_ENVIRONMENT_CITY);
		VALUES.put(new Integer(EAX_ENVIRONMENT_MOUNTAINS.asInt()), EAX_ENVIRONMENT_MOUNTAINS);
		VALUES.put(new Integer(EAX_ENVIRONMENT_QUARRY.asInt()), EAX_ENVIRONMENT_QUARRY);
		VALUES.put(new Integer(EAX_ENVIRONMENT_PLAIN.asInt()), EAX_ENVIRONMENT_PLAIN);
		VALUES.put(new Integer(EAX_ENVIRONMENT_PARKINGLOT.asInt()), EAX_ENVIRONMENT_PARKINGLOT);
		VALUES.put(new Integer(EAX_ENVIRONMENT_SEWERPIPE.asInt()), EAX_ENVIRONMENT_SEWERPIPE);
		VALUES.put(new Integer(EAX_ENVIRONMENT_UNDERWATER.asInt()), EAX_ENVIRONMENT_UNDERWATER);
		VALUES.put(new Integer(EAX_ENVIRONMENT_DRUGGED.asInt()), EAX_ENVIRONMENT_DRUGGED);
		VALUES.put(new Integer(EAX_ENVIRONMENT_DIZZY.asInt()), EAX_ENVIRONMENT_DIZZY);
		VALUES.put(new Integer(EAX_ENVIRONMENT_PSYCHOTIC.asInt()), EAX_ENVIRONMENT_PSYCHOTIC);
		VALUES.put(new Integer(EAX_ENVIRONMENT_COUNT.asInt()), EAX_ENVIRONMENT_COUNT);
	}

	private final String name;
	private final int nativeValue;
	private EAX_ENVIRONMENT(String name, int nativeValue)
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
		if(object instanceof EAX_ENVIRONMENT)
			return asInt() == ((EAX_ENVIRONMENT)object).asInt();
		return false;
	}
	public int compareTo(Object object)
	{
		return asInt() - ((EAX_ENVIRONMENT)object).asInt();
	}


	/**
	 * Retrieve a EAX_ENVIRONMENT enum field with his integer value
	 * @param nativeValue the integer value of the field to retrieve
	 * @return the EAX_ENVIRONMENT enum field that correspond to the integer value
	 */
	public static EAX_ENVIRONMENT get(int nativeValue)
	{
		return (EAX_ENVIRONMENT)VALUES.get(new Integer(nativeValue));
	}

	/**
	 * Retrieve a EAX_ENVIRONMENT enum field from a Pointer
	 * @param pointer a pointer holding an EAX_ENVIRONMENT enum field
	 * @return the EAX_ENVIRONMENT enum field that correspond to the enum field in the pointer
	 */
	public static EAX_ENVIRONMENT get(Pointer pointer)
	{
		return get(pointer.asInt());
	}

	/**
	 * @return an <code>Iterator</code> over the elements in this enumeration.<BR>
	 * Can be cast to <code>Iterator<EAX_ENVIRONMENT></code> in Java 1.5.
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