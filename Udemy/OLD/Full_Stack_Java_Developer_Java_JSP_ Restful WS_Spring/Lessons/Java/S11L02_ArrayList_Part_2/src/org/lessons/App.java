package org.lessons;

import java.util.ArrayList;

public class App {
	static ArrayList<String> listNames = new ArrayList<>();

	public static void main(String[] args) {
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
		System.out.println("***********");
		int postion = app.search("Kayen");
		if (postion != -1) {
			app.modifyName(postion, "King");
			app.displayList(listNames);
		} else {
			System.out.println("Invalid entry");
		}
//		System.out.println(postion);
//		app.modifyName(0, "King");
//		app.displayList(listNames);
	}

	void displayList(ArrayList<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
	}

//	modify a specific entity by position
	void modifyName(int position, String newName) {
		listNames.set(position, newName);
	}

//	modify an entity when the position is unknown
	int search(String name) {
//		returns true if the content is found or false if it is not found
//		listNames.contains(name);
//		returns the index of the object if it is found
		return listNames.indexOf(name);
	}

}
