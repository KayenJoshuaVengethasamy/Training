package org.lessons;

import org.lessons.parent.A;

public class App {
	public static void main(String[] args) {
		new A().demo();
		int test = new A().x;
		System.out.println(test);
	}
}
