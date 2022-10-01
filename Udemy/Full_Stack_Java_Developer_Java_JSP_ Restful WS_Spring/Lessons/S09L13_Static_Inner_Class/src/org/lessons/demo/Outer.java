package org.lessons.demo;

//a true inner class is where all the elements in the class is static
public class Outer {
	public static class Inner {
//		property and variable are one and the same
		public static int x = 0;

		public static void testingInnerMethod() {
			System.out.println("Testing inner class method.");
		}
	}
}
