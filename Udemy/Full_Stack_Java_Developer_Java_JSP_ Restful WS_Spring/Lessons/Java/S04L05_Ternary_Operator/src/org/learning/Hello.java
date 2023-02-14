package org.learning;

public class Hello {

	public static void main(String[] args) {
//		binary operator where there are two operands
//		x*5
//		x+5
//		x-5
//		x%5
		int a = 5;
//		unary operator will only act on single operand
		boolean b = !true;
		boolean c = !(4 > 5);
		System.out.println(c);
//		ternary
		boolean x;
//		assignment then = then ? then before the ? there would be an operation. 
//		based on this, the sections before or after  : will be executed
//		this cannot print statements. Rather assign values of the same type
//		question mark part is the true part, the colon is the false part
		x = (5 > 4) ? true : false;

		int y = 10;

		y = (10 == y) ? 1 : 0;

		System.out.println(y);

	}

}
