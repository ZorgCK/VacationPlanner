
package com.rapidclipse.vacationplanner.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.rapidclipse.framework.server.resources.Caption;


public class Vacation
{
	private final String name = "Urlaubsplaner";
	private final String link = "https://www.hometogo.de/rental/cd2b3bf53e02140b295a70126472a3bc?hl=de_DE";
	
	private final LocalDateTime start     = LocalDateTime.of(2021, 8, 8, 10, 0);
	private final LocalDateTime end       = LocalDateTime.of(2021, 8, 20, 10, 0);
	private final LocalDateTime ship      = LocalDateTime.of(2021, 8, 5, 22, 0);
	private final LocalDateTime departure = LocalDateTime.of(2021, 8, 5, 8, 0);
	private final LocalDateTime arrivel   = LocalDateTime.of(2021, 8, 21, 18, 0);
	
	private final List<Traveller>     travellers = new ArrayList<>();
	private final List<Trip>          trips      = new ArrayList<>();
	private final List<BinaryElement> files      = new ArrayList<>();

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

	@Caption("Reisebeginn")
	public LocalDateTime getStart()
	{
		return this.start;
	}
	
	@Caption("Reiseende")
	public LocalDateTime getEnd()
	{
		return this.end;
	}
	
	@Caption("Fähre")
	public LocalDateTime getShip()
	{
		return this.ship;
	}
	
	@Caption("Abfahrt")
	public LocalDateTime getDeparture()
	{
		return this.departure;
	}
	
	@Caption("Rückkehr")
	public LocalDateTime getArrivel()
	{
		return this.arrivel;
	}
	
}
