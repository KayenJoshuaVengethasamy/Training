package org.lessons;

public class Hello {
	public static void main(String[] args) {
		int x = 4;

		if (x == 1) {
			System.out.println("The value of x is 1");
		} else if (x == 2) {
			System.out.println("The value of x is 2");
		} else if (x == 3) {
			System.out.println("The value of x is 3");
		} else {
			System.out.println("The value of x is other than 1,2,3");
		}
//sequence does not matter, so long as there are breaks and the statements match
//		code blocks can be used but it is not practiced
//		any switch can be replaced with if else combo. It is not a replacement for if else 
		switch (x) {
		default:{
			System.out.println("the value of x is other than 1,2,3");
			break;
		}
		case 1:
			System.out.println("the value of x is 1");
			break;
		case 2:
			System.out.println("the value of x is 2");
			break;
		case 3:
			System.out.println("the value of x is 3");
			break;
		}

	}

}
