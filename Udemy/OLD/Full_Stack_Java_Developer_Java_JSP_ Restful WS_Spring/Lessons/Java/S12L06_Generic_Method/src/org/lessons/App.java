package org.lessons;

import java.util.ArrayList;
import java.util.List;

class Data {
	public <E> void printListData(List<E> list) {
		for (E element : list) {
			System.out.println(element);
		}
	}

	public <E> void printArrayData(E[] arrayData) {
		for (E element : arrayData) {
			System.out.println(element);
		}

	}
}

public class App {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Data data = new Data();
		System.out.println("Printing Integer list");
		System.out.println("***************************************************");
		data.printListData(list);

		List<String> list2 = new ArrayList<>();
		list2.add("Text 1");
		list2.add("Text 2");
		list2.add("Text 3");
		list2.add("Text 4");
		System.out.println("Printing String list");
		System.out.println("***************************************************");
		data.printListData(list2);

		String[] stringArray = { "String 1", "String 2", "String 3", "String 4" };
		Integer[] intergerArray = { 1, 2, 3, 4 };

		System.out.println("Printing String Array");
		System.out.println("***************************************************");
		data.printArrayData(stringArray);
		System.out.println("Printing Integer Array");
		System.out.println("***************************************************");
		data.printArrayData(intergerArray);
		Double[] doubleArray = { 2.0, 5.0, 4.6, 8.5 };
		System.out.println("Printing Double Array");
		System.out.println("***************************************************");
		data.printArrayData(doubleArray);

	}

}
