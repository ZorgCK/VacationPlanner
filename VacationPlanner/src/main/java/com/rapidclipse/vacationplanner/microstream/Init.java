
package com.rapidclipse.vacationplanner.microstream;

import java.time.LocalDateTime;

import com.rapidclipse.vacationplanner.daos.RootDAO;
import com.rapidclipse.vacationplanner.entities.Traveller;
import com.rapidclipse.vacationplanner.entities.Vacation;


public class Init
{
	public static void prepareStorage()
	{
		if(MicroStream.root().isFirstStart())
		{
			Init.initVacation();
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

	private static void initVacation()
	{
		final Vacation v = new Vacation();
		v.getAppointments().put("Beginn", LocalDateTime.of(2021, 8, 8, 10, 0));
		v.getAppointments().put("Ende", LocalDateTime.of(2021, 8, 20, 10, 0));
		v.getAppointments().put("Fähre", LocalDateTime.of(2021, 8, 5, 22, 0));
		v.getAppointments().put("Abfahrt", LocalDateTime.of(2021, 8, 5, 8, 0));
		v.getAppointments().put("Rückkehr", LocalDateTime.of(2021, 8, 21, 18, 0));

		MicroStream.root().setVacation(v);
		MicroStream.storageManager().store(MicroStream.root());
	}

}
