package de.vogella.gwt.helloserver.shared;

import java.io.*;

public class MyUser implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String username;
	private String numberOfHits;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getNumberOfHits() {
		return numberOfHits;
	}
	public void setNumberOfHits(String numberOfHits) {
		this.numberOfHits = numberOfHits;
	}
} 

