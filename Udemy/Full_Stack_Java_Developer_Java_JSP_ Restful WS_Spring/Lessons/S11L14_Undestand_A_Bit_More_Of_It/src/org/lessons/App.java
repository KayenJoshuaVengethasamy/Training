package org.lessons;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names {
	private String name;

	public Names(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class App {

	public static void main(String[] args) {
//		using object as type, we can add anything
		List<Object> elements = new LinkedList<>();
		elements.add(new Names("Taylor"));
		elements.add(new Names("Aoi"));
		elements.add(new Names("Gina"));
		elements.add(new Names("Valentine"));
		elements.add("I Am A String");
		elements.add(1);
		elements.add(2.0);
		elements.add("#");

		App app = new App();
		app.printList(elements);
//		can only work with known types
//		Collections.sort(elements);
//		System.out.println("*****************");
//		app.printList(elements);

	}

	void printList(List<Object> list) {
		ListIterator<Object> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element : " + iterator.next());
		}
	}

}
