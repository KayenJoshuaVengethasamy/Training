package org.lessons;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
	private int vehicleID;

	public Vehicle(int vehicleID) {
		super();
		this.vehicleID = vehicleID;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleID=" + vehicleID + "]";
	}

	void info() {
		System.out.println("Vehicle ID is : " + getVehicleID());
	}

}

class Car extends Vehicle {
	private String carModel;

	public Car(int vehicleID, String carModel) {
		super(vehicleID);
		this.carModel = carModel;
	}

	public String getCarModel() {
		return carModel;
	}

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + "]";
	}

	@Override
	void info() {
		System.out.println("Car ID is : " + getCarModel());
	}

}

public class App {

	public static void main(String[] args) {
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Car(14, "A14"));
		display(list);
	}

//	advantage of a static method is that we can call the method without creating an object
//	? wildcard is used when we are not sure what type we are receiving
//	upperbounf is done by extending the necessary class ny applying it to the upper limit
//	lowerbound will be based on the child, not the parent by using super
	public static void display(List<? extends Vehicle> list) {
		for (Vehicle element : list) {
			element.info();
		}

	}
}
