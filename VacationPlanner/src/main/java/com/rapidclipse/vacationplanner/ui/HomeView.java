
package com.rapidclipse.vacationplanner.ui;

import com.rapidclipse.framework.server.data.converter.ConverterBuilder;
import com.rapidclipse.vacationplanner.HasTitle;
import com.rapidclipse.vacationplanner.entities.Vacation;
import com.rapidclipse.vacationplanner.microstream.MicroStream;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.FormItem;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;


@Route(value = "", layout = MainLayout.class)
public class HomeView extends VerticalLayout implements HasTitle
{
	public HomeView()
	{
		super();
		this.initUI();
		
		final Vacation v = MicroStream.root().getVacation();
		this.lblTitle.setText(v.getName());

		this.binder.readBean(v);
	}

	@Override
	public String getTitle()
	{
		return "Home";
	}

	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.lblTitle      = new Label();
		this.image         = new Image();
		this.form          = new FormLayout();
		this.formItem      = new FormItem();
		this.lblArrivel    = new Label();
		this.dateArrivel   = new DatePicker();
		this.formItem2     = new FormItem();
		this.lblDeparture  = new Label();
		this.dateDeparture = new DatePicker();
		this.formItem3     = new FormItem();
		this.lblEnd        = new Label();
		this.dateEnd       = new DatePicker();
		this.formItem4     = new FormItem();
		this.lblStart      = new Label();
		this.dateStart     = new DatePicker();
		this.formItem5     = new FormItem();
		this.lblShip       = new Label();
		this.dateShip      = new DatePicker();
		this.binder        = new Binder<>();

		this.lblTitle.setText("Label");
		this.lblTitle.getStyle().set("font-weight", "bold");
		this.lblTitle.getStyle().set("font-size", "20px");
		this.image.setSrc("frontend/images/VomMeerTotal.jpg");
		this.form
			.setResponsiveSteps(
				new FormLayout.ResponsiveStep("0px", 1, FormLayout.ResponsiveStep.LabelsPosition.ASIDE));
		this.lblArrivel.setText("Rückkehr");
		this.dateArrivel.setTabIndex(1);
		this.dateArrivel.setReadOnly(true);
		this.lblDeparture.setText("Abfahrt");
		this.dateDeparture.setTabIndex(2);
		this.dateDeparture.setReadOnly(true);
		this.lblEnd.setText("Reiseende");
		this.dateEnd.setTabIndex(3);
		this.dateEnd.setReadOnly(true);
		this.lblStart.setText("Reisebeginn");
		this.dateStart.setTabIndex(4);
		this.dateStart.setReadOnly(true);
		this.lblShip.setText("Fähre");
		this.dateShip.setTabIndex(5);
		this.dateShip.setReadOnly(true);

		this.binder.forField(this.dateArrivel).withConverter(ConverterBuilder.LocalDateToLocalDateTime().build())
			.bind(Vacation::getArrivel, (v, x) -> {});
		this.binder.forField(this.dateDeparture).withConverter(ConverterBuilder.LocalDateToLocalDateTime().build())
			.bind(Vacation::getDeparture, (v, x) -> {});
		this.binder.forField(this.dateEnd).withConverter(ConverterBuilder.LocalDateToLocalDateTime().build())
			.bind(Vacation::getEnd, (v, x) -> {});
		this.binder.forField(this.dateStart).withConverter(ConverterBuilder.LocalDateToLocalDateTime().build())
			.bind(Vacation::getStart, (v, x) -> {});
		this.binder.forField(this.dateShip).withConverter(ConverterBuilder.LocalDateToLocalDateTime().build())
			.bind(Vacation::getShip, (v, x) -> {});

		this.lblArrivel.setSizeUndefined();
		this.lblArrivel.getElement().setAttribute("slot", "label");
		this.dateArrivel.setWidthFull();
		this.dateArrivel.setHeight(null);
		this.formItem.add(this.lblArrivel, this.dateArrivel);
		this.lblDeparture.setSizeUndefined();
		this.lblDeparture.getElement().setAttribute("slot", "label");
		this.dateDeparture.setWidthFull();
		this.dateDeparture.setHeight(null);
		this.formItem2.add(this.lblDeparture, this.dateDeparture);
		this.lblEnd.setSizeUndefined();
		this.lblEnd.getElement().setAttribute("slot", "label");
		this.dateEnd.setWidthFull();
		this.dateEnd.setHeight(null);
		this.formItem3.add(this.lblEnd, this.dateEnd);
		this.lblStart.setSizeUndefined();
		this.lblStart.getElement().setAttribute("slot", "label");
		this.dateStart.setWidthFull();
		this.dateStart.setHeight(null);
		this.formItem4.add(this.lblStart, this.dateStart);
		this.lblShip.setSizeUndefined();
		this.lblShip.getElement().setAttribute("slot", "label");
		this.dateShip.setWidthFull();
		this.dateShip.setHeight(null);
		this.formItem5.add(this.lblShip, this.dateShip);
		this.form.add(this.formItem, this.formItem2, this.formItem3, this.formItem4, this.formItem5);
		this.lblTitle.setSizeUndefined();
		this.image.setWidth("250px");
		this.image.setHeight(null);
		this.form.setSizeUndefined();
		this.add(this.lblTitle, this.image, this.form);
		this.setHorizontalComponentAlignment(FlexComponent.Alignment.CENTER, this.lblTitle);
		this.setHorizontalComponentAlignment(FlexComponent.Alignment.CENTER, this.image);
		this.setSizeFull();
	} // </generated-code>

	// <generated-code name="variables">
	private FormLayout       form;
	private Image            image;
	private Binder<Vacation> binder;
	private DatePicker       dateArrivel, dateDeparture, dateEnd, dateStart, dateShip;
	private Label            lblTitle, lblArrivel, lblDeparture, lblEnd, lblStart, lblShip;
	private FormItem         formItem, formItem2, formItem3, formItem4, formItem5;
	// </generated-code>

}
