package org.learning;

public class Hello {
	public static void main(String[] args) {
//		the first part of the loop is the initialisation
//		the second part is the condition
//		the third part is the increment
//		infinite loop
		while(true) {
			System.out.println("Infinite loop");
//			this will break the inifite loop
			break;
		}
		int i =1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}

}
