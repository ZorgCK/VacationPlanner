
package com.rapidclipse.vacationplanner.entities;

import java.util.ArrayList;
import java.util.List;


public class Traveller
{
	private String           name;
	private final List<Item> items = new ArrayList<>();

	public String getName()
	{
		return this.name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public List<Item> getItems()
	{
		return this.items;
	}
}
