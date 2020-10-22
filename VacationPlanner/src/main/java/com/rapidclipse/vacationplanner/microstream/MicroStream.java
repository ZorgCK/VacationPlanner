
package com.rapidclipse.vacationplanner.microstream;

import one.microstream.storage.configuration.Configuration;
import one.microstream.storage.types.EmbeddedStorageManager;


public final class MicroStream
{
	private final static DataRoot               root = new DataRoot();
	private final static EmbeddedStorageManager storageManager;
	static
	{
		storageManager = Configuration.Default()
			.setBaseDirectoryInUserHome("microstream-data/VacationPlanner")
			.createEmbeddedStorageFoundation()
			.createEmbeddedStorageManager(MicroStream.root)
			.start();
	}
	
	public static DataRoot root()
	{
		return MicroStream.root;
	}
	
	public static EmbeddedStorageManager storageManager()
	{
		return MicroStream.storageManager;
	}
	
	private MicroStream()
	{
	}
}
