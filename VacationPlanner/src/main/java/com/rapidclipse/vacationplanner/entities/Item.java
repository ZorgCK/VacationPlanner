
package com.rapidclipse.vacationplanner.entities;

public class Item
{
	private String  name;
	private Integer amount;
	private Boolean important = false;
	private Boolean isLoaded  = false;
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}
	
	public Integer getAmount()
	{
		return this.amount;
	}
	
	public void setAmount(final Integer amount)
	{
		this.amount = amount;
	}
	
	public Boolean getImportant()
	{
		return this.important;
	}
	
	public void setImportant(final Boolean important)
	{
		this.important = important;
	}
	
	public Boolean getIsLoaded()
	{
		return this.isLoaded;
	}
	
	public void setIsLoaded(final Boolean isLoaded)
	{
		this.isLoaded = isLoaded;
	}
	
}
