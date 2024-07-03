package org.lessons;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Area Of Rectangle with length 5.4 and width 3.2 : " + areaRectangle(5.4, 3.2));
//		double area = areaRectangle(5.4, 3.2);
//		System.out.println(area);
	}

	public static double areaRectangle(double length, double width) {
		return length * width;
	}

}
