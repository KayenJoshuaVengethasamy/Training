package org.lessons;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		countries.add("South Africa");
		countries.add("Egypt");
		countries.add("Greece");
		countries.add("Japan");
		countries.add("India");
		countries.add("Italy");
		new App().printList(countries);
//		add between two objects
		countries.add(1, "England");
		countries.add("Spayn");
		new App().printList(countries);
//		set the value with a new value
		countries.set(7, "Spain");
		new App().printList(countries);
//		remove from the list
//		without arguments, removes the first element
		countries.remove();
		new App().printList(countries);
		countries.remove(3);
		new App().printList(countries);

	}

	void printList(LinkedList<String> list) {
		for (String element : list) {
			System.out.println("Element : " + element);
		}
		System.out.println("************************");
	}

}
