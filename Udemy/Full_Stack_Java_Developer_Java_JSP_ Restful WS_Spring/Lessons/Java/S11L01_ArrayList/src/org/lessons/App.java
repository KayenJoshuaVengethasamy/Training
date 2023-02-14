package org.lessons;

import java.util.ArrayList;

public class App {
//	ArrayList can contain any type of object
	static ArrayList<String> listNames = new ArrayList<>();

	public static void main(String[] args) {
//		add to arrayList
		listNames.add("Kayen");
		listNames.add("Joshua");
		listNames.add("Kandier");
		listNames.add("Vengethasamy");
		listNames.add("Suzuki");
		listNames.add("Ciaz");
		listNames.add("Toyota");
		listNames.add("Corolla");
		App app = new App();
		app.displayList(listNames);
		System.out.println("********");
//		Remember that it is case sensitive
		app.removeNameByString("Corolla");
		app.displayList(listNames);
		System.out.println("********");
		System.out.println(listNames.get(6));
		
//		app.removeNameByPosition(0);
//		System.out.println("*****************");
//		app.displayList(listNames);
//		System.out.println("*****************");
//		System.out.println(listNames.get(0));
//		System.out.println(listNames.get(1));
//		display an arraylist
//		System.out.println(listNames);
//		System.out.println(listNames.get(0));

	}

	void displayList(ArrayList<String> names) {
//		display an arraylist
		for (String name : names) {
			System.out.println(name);
		}
	}

	void removeNameByPosition(int position) {
//		remove an item by index position. Can also do exact name
		listNames.remove(position);
	}

	void removeNameByString(String name) {
//		remove an item by exact name. Can also be by index position
		listNames.remove(name);
	}

}
