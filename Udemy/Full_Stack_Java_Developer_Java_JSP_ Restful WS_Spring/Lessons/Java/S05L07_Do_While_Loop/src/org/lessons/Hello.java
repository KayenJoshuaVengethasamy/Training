package org.lessons;

public class Hello {

	public static void main(String[] args) {
//		do while is special because all the statements is checked before 
//		the condition checking. so even if the condition is false for the 
//		very first time, the statements will be executed

		int i = 11;

		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	}

}
