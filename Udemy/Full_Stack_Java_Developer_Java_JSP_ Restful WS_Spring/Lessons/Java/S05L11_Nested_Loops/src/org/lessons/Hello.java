package org.lessons;

public class Hello {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
/*
 * refer to S05L10 for challenge 
 * 0 
 * 00 
 * 000 
 * 0000 
 * 00000 
 * 000000 
 * 0000000 
 * etc
 */