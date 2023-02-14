package org.lessons;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
//		use List as this is preferred
//		Fast access -- arrayList
//		fast operations -- linkedList
		
		List<String> countries = new LinkedList<>();
		countries.add("South Africa");
		countries.add("Egypt");
		countries.add("Greece");
		countries.add("Japan");
		countries.add("India");
		countries.add("Italy");
		new App().printList(countries);
		
		List<String> demo = new ArrayList<>();
		demo.add("One");
		demo.add("Two");
		demo.add("Three");
		demo.add("Four");
		demo.add("Five");
		new App().printList(demo);

	}

//	List is an interface. The parent of LinkedList
	void printList(List<String> list) {
		for (String element : list) {
			System.out.println("Element : " + element);
		}
		System.out.println("************************");
	}

}
