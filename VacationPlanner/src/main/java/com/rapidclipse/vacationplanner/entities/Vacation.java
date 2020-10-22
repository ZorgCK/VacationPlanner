
package com.rapidclipse.vacationplanner.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Vacation
{
	private final String name = "Urlaubsplaner";
	private final String link = "https://www.hometogo.de/rental/cd2b3bf53e02140b295a70126472a3bc?hl=de_DE";
	
	private final List<Traveller>                travellers   = new ArrayList<>();
	private final List<Trip>                     trips        = new ArrayList<>();
	private final List<BinaryElement>            files        = new ArrayList<>();
	private final HashMap<String, LocalDateTime> appointments = new HashMap<>();

	public List<BinaryElement> getFiles()
	{
		return this.files;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getLink()
	{
		return this.link;
	}
	
	public List<Traveller> getTravellers()
	{
		return this.travellers;
	}
	
	public List<Trip> getTrips()
	{
		return this.trips;
	}
	
	public HashMap<String, LocalDateTime> getAppointments()
	{
		return this.appointments;
	}
	
}
