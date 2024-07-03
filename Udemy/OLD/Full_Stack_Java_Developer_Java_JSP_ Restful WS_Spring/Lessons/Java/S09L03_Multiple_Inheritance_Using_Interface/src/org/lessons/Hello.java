package org.lessons;

import org.lessons.person.NonVegan;
import org.lessons.person.Person;
import org.lessons.person.Vegan;

public class Hello {

	public static void main(String[] args) {
		Person kiyuri = new Vegan();
		kiyuri.breathe();
		kiyuri.eat();
		kiyuri.speak();
		kiyuri.message();
	}

}
