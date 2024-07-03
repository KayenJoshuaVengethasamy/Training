package org.lessons;

public class Demo {
	public static void main(String[] args) {
		int x = 13;

		if (x % 2 == 0) {
			System.out.println("Value is even");
		} else {
			System.out.println("Value is odd");

		}
		
//		calculate sum of digits
		int value = 1234567891;
		int sumOfDigits = 0;
//		my answer
		while(true) {
//			break;
//			divide
//			modulo
			int remainder = value%10;
			sumOfDigits += remainder;
			if(remainder%10 !=0) {
				break;
			}else {
				break;
			}
		}
		System.out.println(sumOfDigits);
		
//		udemy answer
		int aValue = 234567891;
		int aSumOfDigits = 0;
		while (true) {
			aSumOfDigits = aSumOfDigits + aValue%10;
			aValue = aValue/10;
			if(aValue<10) {
				break;
			}
		}
		aSumOfDigits = aSumOfDigits + aValue;
		System.out.println("Sum of digits is : " + aSumOfDigits);
		
	}

}
