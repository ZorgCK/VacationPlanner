
package com.rapidclipse.vacationplanner.microstream;

import com.rapidclipse.vacationplanner.entities.Vacation;


/**
 * MicroStream data root. Create your data model from here.
 *
 * @see <a href="https://manual.docs.microstream.one/">Reference Manual</a>
 */
public class DataRoot
{
	private boolean  isFirstStart = true;
	private Vacation vacation;

	public DataRoot()
	{
		super();
	}
	
	public boolean isFirstStart()
	{
		return this.isFirstStart;
	}
	
	public void setFirstStart(final boolean isFirstStart)
	{
		this.isFirstStart = isFirstStart;
	}
	
	public Vacation getVacation()
	{
		return this.vacation;
	}
	
	public void setVacation(final Vacation vacation)
	{
		this.vacation = vacation;
	}
	
}
