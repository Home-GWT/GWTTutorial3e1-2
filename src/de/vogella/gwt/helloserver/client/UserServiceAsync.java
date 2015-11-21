package de.vogella.gwt.helloserver.client;

import java.util.*;
import com.google.gwt.user.client.rpc.*;
import de.vogella.gwt.helloserver.shared.MyUser;

public interface UserServiceAsync {
  void getUserList(AsyncCallback<List<MyUser>> callback);
  void getUser(String id, AsyncCallback<MyUser> callback);
} 