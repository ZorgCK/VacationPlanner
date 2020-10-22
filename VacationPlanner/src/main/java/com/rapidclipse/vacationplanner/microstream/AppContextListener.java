
package com.rapidclipse.vacationplanner.microstream;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@WebListener
public class AppContextListener implements ServletContextListener
{

	public static Logger LOG = LoggerFactory.getLogger(AppContextListener.class);
	
	@Override
	public void contextInitialized(final ServletContextEvent sce)
	{
		// Start storage
		
		if(MicroStream.root().getVacation() == null)
		{
			Init.prepareStorage();
		}

		AppContextListener.LOG.info("Storage initialized.");
	}
	
	@Override
	public void contextDestroyed(final ServletContextEvent sce)
	{
		// TODO Auto-generated method stub

	}
}
