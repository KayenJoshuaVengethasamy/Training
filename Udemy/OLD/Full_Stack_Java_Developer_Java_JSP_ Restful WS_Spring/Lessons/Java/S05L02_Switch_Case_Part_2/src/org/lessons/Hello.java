//carried over from S05L01
//everything is case sensitive
package org.lessons;

public class Hello {
	public static void main(String[] args) {
		char x = 'a';

		switch (x) {	
		case 'a':
		case 'A':
			System.out.println("the value of x is a");
			break;	
		case 'b':
		case 'B':
			System.out.println("the value of x is a");
			break;	
		case 'c':
		case 'C':
			System.out.println("the value of x is a");
			break;
		default:
			System.out.println("the value of x is other than a,b,c");
			break;
		}

	}

}
