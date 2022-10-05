
package org.lessons;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		List<String> countries = new LinkedList<>();
		countries.add("South Africa");
		countries.add("Egypt");
		countries.add("Greece");
		countries.add("Japan");
		countries.add("India");
		countries.add("Italy");
		new App().printList(countries);
	}

	void printList(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
//		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
//			.next method will return the current element and traverse the list
			System.out.println("Element : " + iterator.next());
		}
	}

}
