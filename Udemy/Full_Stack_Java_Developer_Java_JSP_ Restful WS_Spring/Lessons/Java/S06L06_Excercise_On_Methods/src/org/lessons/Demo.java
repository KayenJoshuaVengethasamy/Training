//refer to S05L04 for initial
package org.lessons;

public class Demo {

	public static void main(String[] args) {
//		int num = 7;
//		int temp;
//		boolean isPrime = true;
//		for (int i = 2; i <= num / 2; i++) {
//			temp = num % i;
//			if (temp == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//		if (isPrime) {
//			System.out.println(num + " is a prime number");
//		} else {
//			System.out.println(num + " is not a prime number");
//		}
//		create a class
//		create a method
//		int/float
//		return boolean
		Calculate prime = new Calculate();
		if (prime.isPrime(7.5)) {
			System.out.println("number passed is a prime number");
		} else {
			System.out.println("number passed is not a prime number");
		}

	}
}
