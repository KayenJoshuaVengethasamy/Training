package org.lessons.vehicles;

import org.lessons.parent.Vehicle;

public class Bike extends Vehicle {
	private String handle;

//	super is used to access the parent constructor default constructor
	public Bike() {
		super();
		this.handle = "short";
	}

	public Bike(String handle) {
		super();
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

}
