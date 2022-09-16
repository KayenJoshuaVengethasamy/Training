package org.lessons;

public class Car {
//	one solution to avoid the null pointer exception
//	private String doors = "opened";
//	private String engine = "off";
//	private String driver = "absent";
//	private int speed = 0;
//	values should always be before constructor
	private String doors;
	private String engine;
	private String driver;
	private int speed;
//	prefered way to resolve the null pointer exception is a constructor, which has the same name as the class
//	whenever we create an object, the constructor will be called automatically

	public Car() {
		doors = "opened";
		engine = "off";
		driver = "absent";
		speed = 0;
	}

	public Car(String doors, String engine, String driver, int speed) {
		//		call to a constructor of a parent class
		//		super();
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String run() {
		if (doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0) {
			return "running";
		} else {
			return "not running";
		}
	}

}
