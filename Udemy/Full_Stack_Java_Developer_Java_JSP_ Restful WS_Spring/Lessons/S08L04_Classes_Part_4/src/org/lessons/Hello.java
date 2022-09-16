package org.lessons;

public class Hello {

	public static void main(String[] args) {
		Car car = new Car();
		car.setDoors("not closed");
		car.setDriver("seated");
		car.setEngine("on");
		car.setSpeed(10);
		System.out.println(car.run());

	}

}
