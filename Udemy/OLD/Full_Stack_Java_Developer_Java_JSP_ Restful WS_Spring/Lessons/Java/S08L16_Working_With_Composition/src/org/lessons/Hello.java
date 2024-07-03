package org.lessons;

import org.lessons.laptop.Laptop;

public class Hello {
	public static void main(String[] args) {
		Laptop lappy = new Laptop();
		System.out.println(lappy);
//		access an object inside an object
		System.out.println(lappy.getProcessor().getBrand());
	}

}
