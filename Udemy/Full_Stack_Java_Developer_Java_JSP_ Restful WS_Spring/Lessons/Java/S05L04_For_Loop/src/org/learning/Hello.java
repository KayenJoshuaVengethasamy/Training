package org.learning;

public class Hello {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println("6\n7\n8\n9\n10");
//		best way to do the for loop
		for (int i = 1000; i >= 1; i--) {
			System.out.print("Value of i : ");
			System.out.println(i);
		}
		int j = 1000;
		for (; j >= 1; j--) {
			System.out.print("Value of j : ");
			System.out.println(j);
		}
		int k = 1000;
		for (;; k--) {
			System.out.print("Value of k : ");
			System.out.println(k);
			if (k <= 1) {
				break;
			}
		}
		int l = 1000;
		for (;;) {
			System.out.print("Value of l : ");
			System.out.println(l);
			if (l <= 1) {
				break;
			}
			l--;
		}
//		infinite loop
		for(;;) {
			System.out.println("Testing Text");
//			comment out the break to make it infinite
			break;
		}
	}

}
