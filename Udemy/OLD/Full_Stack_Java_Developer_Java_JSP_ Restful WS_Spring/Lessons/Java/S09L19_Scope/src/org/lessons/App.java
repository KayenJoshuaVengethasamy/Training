package org.lessons;

public class App {
//	global variable
	public int i = 100;
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
//		scope is based on the braces
		{
			int i = 10;
			System.out.println(i);
		}
//		out of scope. Restricted to the braces and i dies when brace ends
		System.out.println(new App().i);
	}

}
