package de.vogella.gwt.helloserver.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.user.client.ui.*;
import de.vogella.gwt.helloserver.client.ui.*;

public class App implements EntryPoint {

	public void onModuleLoad() {
		final WidgetTable  table = new WidgetTable();
		Button        button = new Button("Показать");
		VerticalPanel vPanel = new VerticalPanel();
    
		vPanel.add(button);
		vPanel.add(table);
		RootPanel.get().add(vPanel);

		button.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				UserServiceAsync  service = (UserServiceAsync)GWT.create(UserService.class);
				service.getUserList(new UserCallback(table));
			}
		});
	}
	
} 