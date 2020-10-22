
package com.rapidclipse.vacationplanner.ui.column;

import com.flowingcode.vaadin.addons.ironicons.IronIcons;
import com.rapidclipse.framework.server.data.renderer.RenderedComponent;
import com.rapidclipse.vacationplanner.entities.Item;
import com.rapidclipse.vacationplanner.microstream.MicroStream;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;


public class GenColPackageItem extends VerticalLayout implements RenderedComponent<Item>
{
	private Item value;
	
	public GenColPackageItem()
	{
		super();
		this.initUI();
	}

	@Override
	public void renderComponent(final Item value)
	{
		this.value = value;

		if(value.getIsLoaded())
		{
			this.button.removeThemeVariants(ButtonVariant.LUMO_ERROR);
			this.button.addThemeVariants(ButtonVariant.LUMO_SUCCESS);
		}
	}

	/**
	 * Event handler delegate method for the {@link Button} {@link #button}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void button_onClick(final ClickEvent<Button> event)
	{
		if(this.value.getIsLoaded())
		{
			this.value.setIsLoaded(false);
			MicroStream.storageManager().store(this.value);
			
			this.button.removeThemeVariants(ButtonVariant.LUMO_SUCCESS);
			this.button.addThemeVariants(ButtonVariant.LUMO_ERROR);
		}
		else
		{
			this.value.setIsLoaded(true);
			MicroStream.storageManager().store(this.value);
			
			this.button.removeThemeVariants(ButtonVariant.LUMO_ERROR);
			this.button.addThemeVariants(ButtonVariant.LUMO_SUCCESS);
		}
	}
	
	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.button = new Button();

		this.setPadding(false);
		this.button.addThemeVariants(ButtonVariant.LUMO_ERROR);
		this.button.setIcon(IronIcons.CHECK.create());

		this.button.setSizeUndefined();
		this.add(this.button);
		this.setSizeUndefined();

		this.button.addClickListener(this::button_onClick);
	} // </generated-code>

	// <generated-code name="variables">
	private Button button;
	// </generated-code>
	
}