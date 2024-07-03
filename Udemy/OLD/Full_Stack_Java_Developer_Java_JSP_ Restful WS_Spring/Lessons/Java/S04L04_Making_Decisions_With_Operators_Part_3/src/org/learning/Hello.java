package org.learning;

public class Hello {
	public static void main(String[] args) {
		/*
		 * boolean a = false; boolean b = false; int c = 5; int d = 10;
		 * 
		 * if (a || false) { System.out.println("Condition is true"); } else {
		 * System.out.println("Condition is false"); }
		 * 
		 * if ((c < d) || (c == d)) { System.out.println("Condition is true"); } else {
		 * System.out.println("Condition is false"); }
		 * 
		 * if ((!(c < d) || (c == d))) { System.out.println("Condition is true"); } else
		 * { System.out.println("Condition is false"); }
		 */

		int ageOfBoy = 21;
		int ageOfGirl = 18;
		int currentGirlAge = 18;
		int currentBoyAge = 72;
//		my answer
		if ((currentBoyAge >= ageOfBoy) && (currentGirlAge >= ageOfGirl)) {
			System.out.println("They can get married");
		} else {
			System.out.println("They cannot get married");
		}
//		udemy answeer

		if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) {
			System.out.println("ready to get married");
		} else {
			System.out.println("Wait for it kiddo!");
		}
	}

}
