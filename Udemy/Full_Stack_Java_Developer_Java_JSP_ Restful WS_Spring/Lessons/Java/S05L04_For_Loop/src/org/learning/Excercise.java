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
//		refer to S06L06 for better
		int num = 5;
		int temp;
		boolean isPrimeB = true;
		for(int i =2; i<= num /2; i++) {
			temp = num % i;
			if(temp == 0) {
				isPrimeB = false;
				break;
			}
		}
		if(isPrimeB) {
			System.out.println(num + " is a prime number");	
		}else {
			System.out.println(num + " is not a prime number");
		}
		

	}
}
