package de.vogella.gwt.helloserver.client;

import java.util.*;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.*;
import de.vogella.gwt.helloserver.shared.*;
import de.vogella.gwt.helloserver.client.ui.*;

public class UserCallback implements AsyncCallback<List<MyUser>> {

	private WidgetTable table;

	public UserCallback(WidgetTable table) {
		this.table = table;
	}

	public void onFailure(Throwable caught) {
		Window.alert(caught.getMessage());
	}

	public void onSuccess(List<MyUser> users) {
		table.setInput(users);
	}

} 