package org.lessons.vehicles;

import org.lessons.parent.Vehicle;

public class Truck extends Vehicle {
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private int container;

//From here was my own interpretation as a challenge
	public Truck() {
		this.steering = "power";
		this.musicSystem = "no";
		this.airConditioner = "no";
		this.container = 0;
	}

	public Truck(String steering, String musicSystem, String airConditioner, int container, String engine, int wheels,
			int seats, int fuelTank, String lights) {
		super(engine, wheels, seats, fuelTank, lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.container = container;
	}

	public String getSteering() {
		return steering;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public String getAirConditioner() {
		return airConditioner;
	}

	public int getContainer() {
		return container;
	}

	@Override
	public String toString() {
		return "Truck [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getContainer()=" + getContainer()
				+ ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats()
				+ ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights() + "]";
	}

}
