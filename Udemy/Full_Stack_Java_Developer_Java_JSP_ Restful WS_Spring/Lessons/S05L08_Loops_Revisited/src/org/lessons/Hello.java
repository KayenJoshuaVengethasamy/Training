package org.lessons;

public class Hello {
	public static void main(String[] args) {

		for (int i = 1, j = 1; i < 10 || j < 10; i++, j++) {
			j++;
			System.out.println("i = " + i + " and j = " + j);
		}

		int k = 1, l = 1;
		while (k < 10 || l < 10) {
			k++;
			l++;
			System.out.println("k = " + k + " and l = " + l);
		}

		int m = 1, n = 1;
		do {
			m++;
			n++;
			System.out.println("m = " + m + " and n = " + n);
		} while (m < 10 || n < 10);

		
	}
}
