package org.lessons.demo;
//the rule is simple : if we want to access the outer elements they need to be static

//this will help in achieving a true inner static class

public class Outer {
//	if we wish to access this variable, it has to be static, otherwise we will use an objects
	public static void testOuterMethod() {
		System.out.println("Value of inner class variable" + Inner.x);
		Inner.testingInnerMethod();
	}

	public static class Inner {
		public static int x = 0;

		public static void testingInnerMethod() {
			System.out.println("Testing inner class method.");
//			if it was not static
//			System.out.println("Test variable value : "+new Outer().testVar);
		}
	}
}
