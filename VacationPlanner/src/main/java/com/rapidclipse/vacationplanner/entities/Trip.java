
package com.rapidclipse.vacationplanner.entities;

import java.math.BigDecimal;


public class Trip
{
	private String name;
	private String description;
	private String link;

	private LinkPreviewResult linkResult;

	private BigDecimal expences;
	private double     duration;
	private double     durationDistance;

	private Boolean   rainday = false;
	private Traveller createdBy;
	
	private double ranking;

	public String getDescription()
	{
		return this.description;
	}

	public void setDescription(final String description)
	{
		this.description = description;
	}

	public String getName()
	{
		return this.name;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}
	
	public String getLink()
	{
		return this.link;
	}
	
	public void setLink(final String link)
	{
		this.link = link;
	}
	
	public BigDecimal getExpences()
	{
		return this.expences;
	}
	
	public void setExpences(final BigDecimal expences)
	{
		this.expences = expences;
	}
	
	public double getDuration()
	{
		return this.duration;
	}
	
	public void setDuration(final double duration)
	{
		this.duration = duration;
	}
	
	public double getDurationDistance()
	{
		return this.durationDistance;
	}
	
	public void setDurationDistance(final double durationDistance)
	{
		this.durationDistance = durationDistance;
	}
	
	public Boolean getRainday()
	{
		return this.rainday;
	}
	
	public void setRainday(final Boolean rainday)
	{
		this.rainday = rainday;
	}
	
	public Traveller getCreatedBy()
	{
		return this.createdBy;
	}
	
	public void setCreatedBy(final Traveller createdBy)
	{
		this.createdBy = createdBy;
	}
	
	public double getRanking()
	{
		return this.ranking;
	}
	
	public void setRanking(final double ranking)
	{
		this.ranking = ranking;
	}

	public LinkPreviewResult getLinkResult()
	{
		return this.linkResult;
	}

	public void setLinkResult(final LinkPreviewResult linkResult)
	{
		this.linkResult = linkResult;
	}

}
