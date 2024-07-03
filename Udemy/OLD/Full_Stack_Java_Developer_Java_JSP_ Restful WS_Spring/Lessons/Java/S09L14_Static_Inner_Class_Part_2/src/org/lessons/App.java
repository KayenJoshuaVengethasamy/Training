package org.lessons;

import org.lessons.demo.Outer;

public class App {
	public static void main(String[] args) {
//		static way
		Outer.testOuterMethod();
//		non static way of access
		new Outer().testOuterMethod();
	}

}
