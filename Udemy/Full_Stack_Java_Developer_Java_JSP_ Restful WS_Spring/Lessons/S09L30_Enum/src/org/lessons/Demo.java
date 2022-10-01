package org.lessons;

//An enum is a collection of predefined constants
public class Demo {
//	constants are usually static and final
//	static for easy access
//	final because the values cannot be changed
//	Constants are always in uppercase
//	public static final int COREJAVA = 1;
//	public static final int COLLECTIONS = 2;
//	public static final int GENERICS = 3;
//	public static final int JSPANDSERVLETS = 4;
//	public static final int MULTITHREADING = 5;

	public static void main(String[] args) {
//		initialising an object as null does not invoke the default case, rather it will throw a null exception
		Learning learn = Learning.MULTITHREADING;
		switch (learn) {
		case COLLECTIONS:
			System.out.println("Step 2 : Learning Collections Framework");
			break;
		case COREJAVA:
			System.out.println("Step 1 : Learning Core Java");
			break;
		case JSPANDSERVLETS:
			System.out.println("Step 4 : Learning JSP and Servlets");
			break;
		case GENERICS:
			System.out.println("Step 3 : Learning Generics");
			break;
		case MULTITHREADING:
			System.out.println("Step 5 : Learning MultiThreading");
			break;
		default:
			System.out.println("Element not in enumarated list");
		}
//		int learning = 8;
//		switch(learning) {
//		case COLLECTIONS:
//			System.out.println("Step 2 : Learning Collections Framework");
//			break;
//		case COREJAVA:
//			System.out.println("Step 1 : Learning Core Java");
//			break;
//		case JSPANDSERVLETS:
//			System.out.println("Step 4 : Learning JSP and Servlets");
//			break;
//		case GENERICS:
//			System.out.println("Step 3 : Learning Generics");
//			break;
//		case MULTITHREADING:
//			System.out.println("Step 5 : Learning MultiThreading");
//			break;
//		}
	}
}
