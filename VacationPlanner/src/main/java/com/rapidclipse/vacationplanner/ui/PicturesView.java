
package com.rapidclipse.vacationplanner.ui;

import com.rapidclipse.vacationplanner.HasTitle;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route(value = "pictures", layout = MainLayout.class)
public class PicturesView extends VerticalLayout implements HasTitle
{
	public PicturesView()
	{
		super();
		this.initUI();
	}
	
	@Override
	public String getTitle()
	{
		return "Pictures";
	}
	
	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.setWidthFull();
		this.setHeight(null);
	} // </generated-code>
	
}
