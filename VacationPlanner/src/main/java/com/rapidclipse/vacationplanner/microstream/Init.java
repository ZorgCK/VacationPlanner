
package com.rapidclipse.vacationplanner.microstream;

import com.rapidclipse.vacationplanner.daos.RootDAO;
import com.rapidclipse.vacationplanner.entities.Traveller;


public class Init
{
	public static void prepareStorage()
	{
		if(MicroStream.root().isFirstStart())
		{
			Init.initTraveller();
			
			RootDAO.finalizeFirstStart();
		}
		else
		{
			new RootDAO();
			System.out.println(RootDAO.isFirstStart());
		}
	}
	
	private static void initTraveller()
	{
		final Traveller t = new Traveller();
		t.setName("Jon Doe");
		
		final Traveller t2 = new Traveller();
		t2.setName("Max Mustermann");

		MicroStream.root().getVacation().getTravellers().add(t);
		MicroStream.root().getVacation().getTravellers().add(t2);
		MicroStream.storageManager().store(MicroStream.root().getVacation().getTravellers());
	}
}
