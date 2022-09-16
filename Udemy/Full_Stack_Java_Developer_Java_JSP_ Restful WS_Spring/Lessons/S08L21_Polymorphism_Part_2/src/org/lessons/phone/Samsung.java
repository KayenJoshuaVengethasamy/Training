package org.lessons.phone;

public class Samsung extends Phone {
	private String model;

	public Samsung(String model) {
		super(model);
	}

	public void features() {
		System.out.println("Android flagship");
	}

}
