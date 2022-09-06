package org.lessons;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Area of rectangle : "+area(14.25d,10.65d));
		System.out.println("Area of square : "+area(.5));
	}
	
	public static double area(double length, double width) {
		return length*width;		
	}
	
	public static double area(double side) {
		return side*side;		
	}
	
	public static int area(int side) {
		return side*side;		
	}

}
