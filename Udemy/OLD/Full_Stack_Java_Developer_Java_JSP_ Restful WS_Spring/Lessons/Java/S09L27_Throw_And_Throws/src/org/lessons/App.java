package org.lessons;

import java.io.FileNotFoundException;

//throw keyword is used to declare an exception
//if we want to create an exception explicitly, then use the throw keyword
//remember the importance of heiracy
//a child class cannot handle a parent class exception
public class App {

	public static void main(String[] args) {
		try {
			someMethod();
		} catch (FileNotFoundException e) {
			System.out.println("Catch block of main method");
		} catch (Exception e) {
			System.out.println("Catch block of main method(Exception)");
		}
	}

//	whenever we throw an exception or in the declaration we use the throws keyword, 
//	that method will throw an exception that needs to be handled where we are calling the method
	public static void someMethod() throws Exception {
		System.out.println("Message from someMethod");
		throw new Exception();
//		System.out.println("Message from someMethod");
	}

}
