package org.lessons;

public class B extends A {
// if a variable is final, there should not be a setter value for it 
//	a final variable is not constant, we can initialise it through a constructor, reassignment is not possible
//	if we initiliase outside the constructor, the constructor will not work
	private final int x;

	public B(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}

}
