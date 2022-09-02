package org.training;

public class Hello {

	public static void main(String[] args) {
		int x = 5;

		/*
		 * if (x == 5) { if(x>5) { System.out.println("x greater than 5"); }else {
		 * System.out.println("x less than 5"); } }
		 */
		if(x==5) {
			System.out.println("x equals five");
		}else if (x>5){
			System.out.println("x is greater than 5");
		}else {
			System.out.println("x is less than 5");
		}
	}
}