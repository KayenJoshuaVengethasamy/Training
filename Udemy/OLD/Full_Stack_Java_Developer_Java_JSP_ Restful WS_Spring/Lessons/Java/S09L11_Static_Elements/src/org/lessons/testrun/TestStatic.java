package org.lessons.testrun;
//	we will not be able to mark the class as static, explanation later
public class TestStatic {
//	static variable has an independent memory location
//	there is a single copy in memory, there are not dependent on objects
//	hence when we are making changes using a single object, it will be reflected in other objects
//	this is because there is a specific variable is shared between all of the objects
	private static int staticVariable = 0;

//	the correct way if the object is static
//	methods need to be static as well because static elements needs to be accessed in a static way
	public static int getStaticVariable() {
		return staticVariable;
	}

	public static void setStaticVariable(int staticVariable) {
		TestStatic.staticVariable = staticVariable;
	}
//the previous way if the object is not static
//	public int getStaticVariable() {
//		return staticVariable;
//	}
//
//	public void setStaticVariable(int staticVariable) {
//		this.staticVariable = staticVariable;
//	}

}
