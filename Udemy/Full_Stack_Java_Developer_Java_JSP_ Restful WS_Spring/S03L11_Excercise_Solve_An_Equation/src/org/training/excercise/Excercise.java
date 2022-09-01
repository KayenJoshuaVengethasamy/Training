package org.training.excercise;

public class Excercise {

	public static void main(String[] args) {
//		(a+b)squared = ((a*a) + 2ab + (b*b))
//		my answer	
		int a = 25;
		float b= 42.159f;
		long value = (long) ((a*a) + (2*a*b) + (b*b));
		long expected = (long) ((a+b)*(a+b));
		System.out.println("Expected : " + expected);
		System.out.println("Value : " + value);
//		udemy answer
		int a1 = 25;
		float b1 = 42.159f;
		double value1 = a1*a1 + 2*(a1*b1)+ b1*b1;
		System.out.println("Value of the equation is : " + value1);
//		udemy answer if you do not want anything after the decimal	
		int a2 = 25;
		float b2 = 42.159f;
		int value2 = (int) (a2*a2 + 2*(a2*b2)+ b2*b2);
		System.out.println("Value of the equation is : " + value2);
				
	}

}
