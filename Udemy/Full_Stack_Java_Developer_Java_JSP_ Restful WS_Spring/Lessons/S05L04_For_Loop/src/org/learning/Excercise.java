package org.learning;

public class Excercise {
	public static void main(String[] args) {
//myAnswer
		int isPrime = 31;
		for (int i = 2; i < isPrime; i++) {
			if ((isPrime % i == 0)) {
				System.out.print("This number is not ");
				break;
			}
		}
		System.out.print("PRIME NUMBER");
//		udemy answer
		

	}
}
