/**
 * 						NativeBass Project
 *
 * Want to use BASS (www.un4seen.com) in the Java language ? NativeBass is made for you.
 * Copyright � 2007 J�r�me JOUVIE (Jouvieje)
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

package org.jouvieje.bass.callbacks;

import java.util.Enumeration;
import java.util.Hashtable;

import org.jouvieje.bass.Init;
import org.jouvieje.bass.defines.INIT_MODES;
import org.jouvieje.bass.exceptions.CallbackException;

//TODO Make this class invisible

/**
 * <b><u>WARNING</u></b><br>
 * DO NOT USE THIS CLASS !!!
 */
public class CallbackManager
{
	private final static boolean DEBUG_MODE = false;

	//Variable used to know if INIT_BASS_MINIMUM was used to initialized BASS
	protected static boolean useCallbacks = false;
	protected final static String ERROR_MESSAGE = "A callback was used with Init.loadLibraries(INIT_BASS_MINIMUM) !";

	/*
	 * Key   : owner    (Long)
	 * Value : Callback (Object)
	 */
	protected static Hashtable[] callbacksTable = null;
	//Store the last callback added
	protected static Object[] lastCallbacksAdded = null;
	/*
	 * Key   : object (Long)
	 * Value : owner (Long)
	 */
	protected static Hashtable ownersTable = null;

	static
	{
		if(Init.getInitMode() == INIT_MODES.INIT_BASS)
		{
			callbacksTable = new Hashtable[CallbackBridge.NB_CALLBACKS];
			lastCallbacksAdded = new Object[CallbackBridge.NB_CALLBACKS];
			ownersTable = new Hashtable();
			for(int i = 0; i < callbacksTable.length; i++)
			{
				callbacksTable[i] = new Hashtable();
				lastCallbacksAdded[i] = null;
			}
			useCallbacks = true;
		}
	}

	public static Object getCallback(int type)
	{
		return getCallback(type, 0, false);
	}
	public static Object getCallback(int type, long object, boolean autoAttach)
	{
		if(!useCallbacks)
			throw new RuntimeException(ERROR_MESSAGE);

		Long owner = (object == 0) ? new Long(0) : (Long)ownersTable.get(new Long(object));
		if(owner != null)
		{
			Object callback = callbacksTable[type].get(owner);
			if(callback == null)
			{
				if(object == 0)
				{
					if(DEBUG_MODE)
						printDebug("Owner not found (type="+type+" object="+object+")! Try to use last Callbacks added");
					callback = lastCallbacksAdded[type];
				}
				if(callback == null)
					throw new CallbackException("A callback may not be implemented for the moment. Contact NativeBass support to know more about this.");
			}
			if(DEBUG_MODE)
				printDebug("Get Callback type="+type+"("+getCallbackName(type)+") owner="+owner);
			return callback;
		}
		else
		{
			if(DEBUG_MODE)
				printDebug("Owner not found (type="+type+" object="+object+")! Use last Callbacks.");
			Object callback = lastCallbacksAdded[type];
			if(callback == null)
			{
				throw new CallbackException("A callback may not be implemented for the moment. Contact NativeBass support to know more about this.");
			}
			if(autoAttach)
			{
				Enumeration values = callbacksTable[type].elements();
				Enumeration keys = callbacksTable[type].keys();
				while(values.hasMoreElements())
				{
					Object currentValue = values.nextElement();
					Long currentKey = (Long)keys.nextElement();
					if(currentValue == callback)
					{
						owner = currentKey;
						addOwner(owner.longValue(), object);
						break;
					}
				}
			}
			if(DEBUG_MODE)
				printDebug("Get Callback type="+type+"("+getCallbackName(type)+") owner="+owner);
			return callback;
		}
	}

	public static void addTmpCallback(int type, Object callback)
	{
		if(!useCallbacks)
		{
			if(callback != null)
				throw new RuntimeException(ERROR_MESSAGE);
			return;
		}
		
		if(callback != null)
		{
			lastCallbacksAdded[type] = callback;

			if(DEBUG_MODE)
				printDebug("Add Temporary Callback type="+type);
		}
	}
	public static void addCallback(int type, Object callback, long owner)
	{
		if(!useCallbacks)
		{
			if(callback != null)
				throw new RuntimeException(ERROR_MESSAGE);
			return;
		}

		if(callbacksTable[type].remove(new Long(owner)) != null)
		{
			lastCallbacksAdded[type] = null;
			if(DEBUG_MODE)
				printDebug("Removing Callback type="+type+" owner="+owner);
		}
		if(callback != null)
		{
			callbacksTable[type].put(new Long(owner), callback);
			lastCallbacksAdded[type] = callback;

			if(DEBUG_MODE)
				printDebug("Add Callback type="+type+" owner="+owner);
		}
	}

	public static void addOwner(long owner, long object)
	{
		if(!useCallbacks)
			return;

		Object o = ownersTable.remove(new Long(object));
		if(o != null)
		{
			if(DEBUG_MODE)
				printDebug("Removing Owner owner="+(o != null ? ((Long)o).longValue() : 0)+" object="+object);
		}
		if(owner != 0)
		{
			ownersTable.put(new Long(object), new Long(owner));

			if(DEBUG_MODE)
				printDebug("Add Owner owner="+owner+" object="+object);
		}
	}

	public static String getCallbackName(int type)
	{
		return CallbackBridge.getCallbackName(type);
	}

						/* For DEBUG mode*/

	private static void printDebug(String message)
	{
		java.lang.System.out.println("CALLBACK MANAGER : "+message);
	}
}