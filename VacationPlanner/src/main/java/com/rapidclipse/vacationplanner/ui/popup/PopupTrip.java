
package com.rapidclipse.vacationplanner.ui.popup;

import com.rapidclipse.vacationplanner.entities.LinkPreviewResult;
import com.rapidclipse.vacationplanner.entities.Trip;
import com.rapidclipse.vacationplanner.entities.Vacation;
import com.rapidclipse.vacationplanner.microstream.MicroStream;
import com.rapidclipse.vacationplanner.rest.RestClient;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.FormItem;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.BigDecimalField;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.ValidationException;


public class PopupTrip extends Dialog
{
	private Trip     trip;
	private Runnable onOkListener;
	
	public PopupTrip()
	{
		super();
		this.initUI();
		
		this.nrDurationDistance.setHasControls(true);
		this.nrDuration.setHasControls(true);
		this.nrRanking.setHasControls(true);
	}
	
	public PopupTrip setTrip(final Trip trip)
	{
		this.trip = trip;
		this.binder.readBean(this.trip);
		return this;
	}
	
	public PopupTrip setOnOkCallback(final Runnable listener)
	{
		this.onOkListener = listener;
		return this;
	}
	
	/**
	 * Event handler delegate method for the {@link Button} {@link #button}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void button_onClick(final ClickEvent<Button> event)
	{
		try
		{
			this.binder.writeBean(this.trip);

			final LinkPreviewResult linkPreview = RestClient.link(this.trip.getLink());
			this.trip.setLinkResult(linkPreview);

			final Vacation vacation = MicroStream.root().getVacation();

			if(vacation.getTrips().contains(this.trip))
			{
				MicroStream.storageManager().store(this.trip);
			}
			else
			{
				vacation.getTrips().add(this.trip);
				MicroStream.storageManager().store(vacation.getTrips());
			}

			this.onOkListener.run();
			this.close();
		}
		catch(final ValidationException e)
		{
			e.printStackTrace();
		}
	}
	
	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.verticalLayout      = new VerticalLayout();
		this.form                = new FormLayout();
		this.formItem            = new FormItem();
		this.lblName             = new Label();
		this.txtName             = new TextField();
		this.formItem2           = new FormItem();
		this.lblLink             = new Label();
		this.txtLink             = new TextField();
		this.formItem3           = new FormItem();
		this.lblExpences         = new Label();
		this.bigdExpences        = new BigDecimalField();
		this.formItem4           = new FormItem();
		this.lblDescription      = new Label();
		this.txtDescription      = new TextField();
		this.formItem5           = new FormItem();
		this.lblDurationDistance = new Label();
		this.nrDurationDistance  = new NumberField();
		this.formItem6           = new FormItem();
		this.lblDuration         = new Label();
		this.nrDuration          = new NumberField();
		this.formItem7           = new FormItem();
		this.lblRanking          = new Label();
		this.nrRanking           = new NumberField();
		this.formItem8           = new FormItem();
		this.lblRainday          = new Label();
		this.chkRainday          = new Checkbox();
		this.binder              = new Binder<>();
		this.button              = new Button();

		this.verticalLayout.setPadding(false);
		this.form
			.setResponsiveSteps(new FormLayout.ResponsiveStep("0px", 1, FormLayout.ResponsiveStep.LabelsPosition.TOP));
		this.lblName.setText("Name");
		this.txtName.setTabIndex(1);
		this.lblLink.setText("Link");
		this.txtLink.setTabIndex(2);
		this.lblExpences.setText("Kosten");
		this.bigdExpences.setTabIndex(3);
		this.lblDescription.setText("Beschreibung");
		this.txtDescription.setTabIndex(4);
		this.lblDurationDistance.setText("Zeit Anfahrt");
		this.nrDurationDistance.setTabIndex(5);
		this.lblDuration.setText("Dauer Gesamt");
		this.nrDuration.setTabIndex(6);
		this.lblRanking.setText("Rating");
		this.nrRanking.setTabIndex(7);
		this.nrRanking.setMin(0.0);
		this.nrRanking.setMax(5.0);
		this.nrRanking.setStep(0.5);
		this.lblRainday.setText("Regentag");
		this.chkRainday.setTabIndex(8);
		this.chkRainday.setLabel("Checkbox");
		this.button.setText("Übernehmen");
		this.button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

		this.binder.forField(this.txtName).withNullRepresentation("").bind(Trip::getName, Trip::setName);
		this.binder.forField(this.txtLink).withNullRepresentation("").bind(Trip::getLink, Trip::setLink);
		this.binder.forField(this.bigdExpences).bind(Trip::getExpences, Trip::setExpences);
		this.binder.forField(this.txtDescription).withNullRepresentation("").bind(Trip::getDescription,
			Trip::setDescription);
		this.binder.forField(this.nrDurationDistance).bind(Trip::getDurationDistance, Trip::setDurationDistance);
		this.binder.forField(this.nrDuration).bind(Trip::getDuration, Trip::setDuration);
		this.binder.forField(this.nrRanking).bind(Trip::getRanking, Trip::setRanking);
		this.binder.forField(this.chkRainday).withNullRepresentation(false).bind(Trip::getRainday, Trip::setRainday);

		this.lblName.setSizeUndefined();
		this.lblName.getElement().setAttribute("slot", "label");
		this.txtName.setWidthFull();
		this.txtName.setHeight(null);
		this.formItem.add(this.lblName, this.txtName);
		this.lblLink.setSizeUndefined();
		this.lblLink.getElement().setAttribute("slot", "label");
		this.txtLink.setWidthFull();
		this.txtLink.setHeight(null);
		this.formItem2.add(this.lblLink, this.txtLink);
		this.lblExpences.setSizeUndefined();
		this.lblExpences.getElement().setAttribute("slot", "label");
		this.bigdExpences.setWidthFull();
		this.bigdExpences.setHeight(null);
		this.formItem3.add(this.lblExpences, this.bigdExpences);
		this.lblDescription.setSizeUndefined();
		this.lblDescription.getElement().setAttribute("slot", "label");
		this.txtDescription.setWidthFull();
		this.txtDescription.setHeight(null);
		this.formItem4.add(this.lblDescription, this.txtDescription);
		this.lblDurationDistance.setSizeUndefined();
		this.lblDurationDistance.getElement().setAttribute("slot", "label");
		this.nrDurationDistance.setWidthFull();
		this.nrDurationDistance.setHeight(null);
		this.formItem5.add(this.lblDurationDistance, this.nrDurationDistance);
		this.lblDuration.setSizeUndefined();
		this.lblDuration.getElement().setAttribute("slot", "label");
		this.nrDuration.setWidthFull();
		this.nrDuration.setHeight(null);
		this.formItem6.add(this.lblDuration, this.nrDuration);
		this.lblRanking.setSizeUndefined();
		this.lblRanking.getElement().setAttribute("slot", "label");
		this.nrRanking.setWidthFull();
		this.nrRanking.setHeight(null);
		this.formItem7.add(this.lblRanking, this.nrRanking);
		this.lblRainday.setSizeUndefined();
		this.lblRainday.getElement().setAttribute("slot", "label");
		this.chkRainday.setWidthFull();
		this.chkRainday.setHeight(null);
		this.formItem8.add(this.lblRainday, this.chkRainday);
		this.form.add(this.formItem, this.formItem2, this.formItem3, this.formItem4, this.formItem5, this.formItem6,
			this.formItem7, this.formItem8);
		this.form.setSizeUndefined();
		this.button.setWidthFull();
		this.button.setHeight(null);
		this.verticalLayout.add(this.form, this.button);
		this.verticalLayout.setSizeFull();
		this.add(this.verticalLayout);
		this.setWidthFull();
		this.setHeight(null);

		this.button.addClickListener(this::button_onClick);
	} // </generated-code>
	
	// <generated-code name="variables">
	private FormLayout      form;
	private Checkbox        chkRainday;
	private Button          button;
	private BigDecimalField bigdExpences;
	private NumberField     nrDurationDistance, nrDuration, nrRanking;
	private VerticalLayout  verticalLayout;
	private Label           lblName, lblLink, lblExpences, lblDescription, lblDurationDistance, lblDuration, lblRanking,
		lblRainday;
	private Binder<Trip>    binder;
	private TextField       txtName, txtLink, txtDescription;
	private FormItem        formItem, formItem2, formItem3, formItem4, formItem5, formItem6, formItem7, formItem8;
	// </generated-code>

}
