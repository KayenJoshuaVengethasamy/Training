package org.lessons.person;

public abstract class Person implements IsAlive, LiveLife {

	public void speak() {
		System.out.println("Shares his/her thoughts");
	}

	public abstract void eat();

	@Override
	public void breathe() {
		System.out.println("be alive; remain living");
	}

	@Override
	public void message() {
		System.out.println("Life is a journey, keep moving and meet new people");
	}

}
