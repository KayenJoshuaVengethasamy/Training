package org.lessons.vehicles;

import org.lessons.parent.Vehicle;

public class Bike extends Vehicle {
	private String handle;

	public Bike() {
		super();
		this.handle = "short";
	}

//child constructor
	public Bike(String handle, String engine, int wheels, int seats, int fuelTank, String lights) {
//		super("diesel", 4, 4, 40, "LED"); // Values for possible car class is passed, please ignore the mistake
		super(engine, wheels, seats, fuelTank, lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

}
