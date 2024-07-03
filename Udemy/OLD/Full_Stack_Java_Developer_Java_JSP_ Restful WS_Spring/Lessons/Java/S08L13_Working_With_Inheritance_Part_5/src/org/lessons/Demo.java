package org.lessons;

import org.lessons.vehicles.Bike;

public class Demo {
	public static void main(String[] args) {
		Bike bike = new Bike("long", "diesel", 4, 5, 40, "LED");
		bike.run();
	}

}
