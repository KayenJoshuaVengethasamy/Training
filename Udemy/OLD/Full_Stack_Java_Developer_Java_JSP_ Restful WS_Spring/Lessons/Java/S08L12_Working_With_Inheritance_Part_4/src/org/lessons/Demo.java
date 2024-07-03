package org.lessons;

import org.lessons.vehicles.Bike;
import org.lessons.vehicles.Car;
import org.lessons.vehicles.Truck;

public class Demo {
	public static void main(String[] args) {
//		Bike bike = new Bike("long","diesel", 4, 5, 40, "LED");
		Bike bike = new Bike();
		System.out.println(bike);
//		From here was my own interpretation as a challenge
//		Car car = new Car("power","yes", "yes","yes","yes","diesel", 4, 5, 40, "LED");
		Car car = new Car();
		System.out.println(car);
		Truck truck = new  Truck("truck", "yebo", "yes", 700, "electric", 16,2,500,"Halogen");
//		Truck truck = new Truck();
		System.out.println(truck);
	}

}
