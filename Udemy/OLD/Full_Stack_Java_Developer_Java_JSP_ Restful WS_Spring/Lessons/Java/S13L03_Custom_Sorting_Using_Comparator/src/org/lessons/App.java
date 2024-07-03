package org.lessons;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Data<K, V> {
	private K key;
	private V value;

	public Data(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}

}

public class App {
	public static void main(String[] args) {
//		comparable is not able to handle key value pairs or more than one entity
//		use comparator gives us an oppurtunity to give us multiple sorting options
		Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {
//can only be done on similar objects only
			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if (obj1.getKey() < obj2.getKey()) {
					return -1;
				} else if (obj1.getKey() > obj2.getKey()) {
					return 1;
				} else {
					return 0;
				}
			}
		};

		Comparator<Data<Integer, String>> COMPARE_NAME_LENGTH = new Comparator<Data<Integer, String>>() {
			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if (obj1.getValue().length() < obj2.getValue().length()) {
					return -1;
				} else if (obj1.getValue().length() > obj2.getValue().length()) {
					return 1;
				} else {
					return 0;
				}
			}
		};
		Set<Data<Integer, String>> set = new TreeSet<>(COMPARE_KEY);
		set.add(new Data<Integer, String>(1, "Kayen"));
		set.add(new Data<Integer, String>(5, "Ed"));
		set.add(new Data<Integer, String>(9, "John"));
		set.add(new Data<Integer, String>(2, "Arnold J"));
		set.add(new Data<Integer, String>(5, "Mike"));
		for (Data<Integer, String> element : set) {
			System.out.println(element);
		}
		System.out.println("***********************************");
		Set<Data<Integer, String>> set2 = new TreeSet<>(COMPARE_NAME_LENGTH);
		set2.add(new Data<Integer, String>(1, "Kayen"));
		set2.add(new Data<Integer, String>(5, "Ed"));
		set2.add(new Data<Integer, String>(9, "John"));
		set2.add(new Data<Integer, String>(2, "Arnold J"));
		set2.add(new Data<Integer, String>(5, "Mike"));
		for (Data<Integer, String> element : set2) {
			System.out.println(element);
		}

	}

}
