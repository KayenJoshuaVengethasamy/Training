package org.lessons;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a int value");
		int x = scan.nextInt();
		System.out.println(x);
//		stop a resource leak
//		this is slightly mundane, rather user try with resources
//		whenever we are allocating a resource, which needs to be closed we will be using the particular allocation statement
//		in essence, make use of try with resources when ever we are making use of objects that need to be closed
		scan.close();
	}

}
