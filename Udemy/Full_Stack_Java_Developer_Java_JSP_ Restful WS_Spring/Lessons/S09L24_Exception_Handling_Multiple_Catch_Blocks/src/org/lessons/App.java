package org.lessons;

public class App {

	public static void main(String[] args) {
		int x = 0;
		try {
//			System.out.println("The statement will get executed");
			System.out.println("We don't know what will be the outcome : " + x / 0);
//			System.out.println("The statement will not get executed");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occurred");
		} catch (Exception e) {
			System.out.println("Inside exception block");
		}

	}

}
