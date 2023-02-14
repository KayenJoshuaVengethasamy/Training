package org.lessons;

import org.lessons.testrun.TestStatic;

public class App {

	public static void main(String[] args) {

//		accessing static variables
		System.out.println("Current variable value : " + TestStatic.getStaticVariable());
		TestStatic.setStaticVariable(1);
		System.out.println("Current variable value : " + TestStatic.getStaticVariable());
		TestStatic.setStaticVariable(24);
		System.out.println("Current variable value : " + TestStatic.getStaticVariable());

//		accessing non-static variables
//		TestStatic obj1 = new TestStatic();
//		System.out.println("obj 1 current variable value : " + obj1.getStaticVariable());
//		obj1.setStaticVariable(1);
//		System.out.println("obj 1 current variable value : " + obj1.getStaticVariable());
//		
//		TestStatic obj2 = new TestStatic();
//		System.out.println("obj 2 current variable value : " + obj2.getStaticVariable());
//		obj2.setStaticVariable(24);
//		System.out.println("obj 2 current variable value : " + obj2.getStaticVariable());
//		
//		TestStatic obj3 = new TestStatic();
//		System.out.println("obj 3 current variable value : " + obj3.getStaticVariable());

	}

}
