package org.lessons;

import org.lessons.vehicles.Bike;

public class Demo {
	public static void main(String[] args) {
		Bike bike = new Bike("long","diesel", 4, 5, 40, "LED"); // Values for possible car class is passed, please ignore the mistake
		System.out.println("Handle : "+bike.getHandle());
		System.out.println("Engine Type : "+bike.getEngine());
		System.out.println("Number Of Seats : "+bike.getSeats());
		System.out.println("Fuel Tank Capacity : "+bike.getFuelTank());
		System.out.println("Head Lamp Type : "+bike.getLights());
		System.out.println("Number of wheels : "+bike.getWheels());
	}

}
