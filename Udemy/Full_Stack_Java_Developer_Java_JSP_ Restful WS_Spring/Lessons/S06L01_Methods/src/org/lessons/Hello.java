package org.lessons;

public class Hello {

	public static void main(String[] args) {
		loop1();
		System.out.println("*********************");
		loop2();
		System.out.println("*********************");
		loop1();
		System.out.println("*********************");
		loop(1, 10);
		System.out.println("*********************");
		loop(20, 40);
		System.out.println("*********************");
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("*********************");
		int j = 20;
		while (j <= 40) {
			System.out.println(j);
			j++;
		}
	}

	public static void loop1() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

	public static void loop2() {
		int j = 20;
		while (j <= 40) {
			System.out.println(j);
			j++;
		}
	}

	public static void loop(int step, int finalValue) {
		while (step <= finalValue) {
			System.out.println(step);
			step++;
		}

	}

}
