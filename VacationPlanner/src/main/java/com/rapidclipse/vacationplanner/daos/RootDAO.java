
package com.rapidclipse.vacationplanner.daos;

import com.rapidclipse.vacationplanner.microstream.MicroStream;


public class RootDAO
{

	public static boolean isFirstStart()
	{
		return MicroStream.root().isFirstStart();
	}

	public static void finalizeFirstStart()
	{
		MicroStream.root().setFirstStart(false);
		MicroStream.storageManager().storeRoot();
	}

}
