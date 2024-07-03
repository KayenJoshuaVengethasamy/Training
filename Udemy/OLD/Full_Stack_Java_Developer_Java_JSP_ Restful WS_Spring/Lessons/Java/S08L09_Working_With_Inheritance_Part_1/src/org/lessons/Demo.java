package org.lessons;

import org.lessons.vehicles.Bike;

public class Demo {
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.handle = "Short";
		bike.engine = "Petrol";
		
		System.out.println(bike.engine);
	}

}
