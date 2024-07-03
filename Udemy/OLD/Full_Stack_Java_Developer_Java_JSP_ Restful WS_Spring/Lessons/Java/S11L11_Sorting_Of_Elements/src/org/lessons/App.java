package org.lessons;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		countries.add("South Africa");
		countries.add("Egypt");
		countries.add("Greece");
		countries.add("Japan");
		countries.add("India");
		countries.add("Italy");
		App app = new App();
		app.printList(countries);
		System.out.println("**************");
//		this will sort the elements by natural order if it is null. We can alter it with different parameters
//		with string, natural is alphabetical
//		countries.sort(null);
//		app.printList(countries);
//		System.out.println("**************");
//		reverse the order of the list
		Collections.reverse(countries);
		app.printList(countries);
		System.out.println("**************");

	}

	void printList(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element : " + iterator.next());
		}
	}

}
