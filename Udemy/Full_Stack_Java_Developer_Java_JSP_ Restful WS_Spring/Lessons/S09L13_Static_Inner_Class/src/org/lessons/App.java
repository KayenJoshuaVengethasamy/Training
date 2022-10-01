package org.lessons;

import org.lessons.demo.Outer;

public class App {
	public static void main(String[] args) {
		Outer.Inner.testingInnerMethod();
		System.out.println(Outer.Inner.x);

	}

}
