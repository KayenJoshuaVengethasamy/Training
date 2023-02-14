package org.lessons;

public class Hello {
	public static void main(String[] args) {
//		a complete iteration of the inner loop is only one iteration of the outer loop
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println("Value of i " + i + " and value of " + j);
			}
			System.out.println("****************************");
		}

//		challenge
//		my answer no work
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}

		}

//		Internet answer
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
/*
 * challenge
 *  refer to S05L11 for udemy answer 
 *  0
 *  00 
 *  000
 *  0000 
 *  00000 
 *  000000 
 *  0000000
 *  etc
 */