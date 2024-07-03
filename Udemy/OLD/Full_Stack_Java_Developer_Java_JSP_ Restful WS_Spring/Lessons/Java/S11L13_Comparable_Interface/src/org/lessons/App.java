package org.lessons;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names> {
	private String name;

	public Names(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Names obj) {
		if (name.length() == obj.name.length()) {
			return 0;
		} else if (name.length() < obj.name.length()) {
//			ascending use -1
//			descending use 1
			return 1;
		} else {
//			ascending use 1
//			descending use -1

			return -1;
		}
	}

	@Override
	public String toString() {
		return name;
	}
}

public class App {

	public static void main(String[] args) {
//		.sort works well for known types(String etc)
//		For custom types, we use the comparable interface
//		This is the syntax
//		String x = "a";
//		String y = "b";
//		x.compareTo(y);
		List names = new LinkedList<>();
		names.add(new Names("Taylor"));
		names.add(new Names("Aoi"));
		names.add(new Names("Gina"));
		names.add(new Names("Valentine"));

		App app = new App();
		app.printList(names);

		Collections.sort(names);
		System.out.println("*****************");
		app.printList(names);

	}

	void printList(List<Names> list) {
		ListIterator<Names> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element : " + iterator.next());
		}
	}

}
