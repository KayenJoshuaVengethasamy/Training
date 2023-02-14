package org.lessons;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Whats your age?");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		System.out.println("Your age is : " + age);
	}

}
