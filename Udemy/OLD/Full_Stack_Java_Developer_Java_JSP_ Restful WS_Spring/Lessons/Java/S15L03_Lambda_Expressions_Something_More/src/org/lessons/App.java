package org.lessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data {
	private String name;

	public Data(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

}

public class App {
	public static void main(String[] args) {
		List<Data> list = new ArrayList<>();
		list.add(new Data("Kayen"));
		list.add(new Data("Joshua"));
		list.add(new Data("Kandier"));
		list.add(new Data("Vengethasamy"));
		list.add(new Data("Wolf"));
//		sort list by natural ordering
//		using lambda
//		braces require full statements
		Collections.sort(list, (Data o1, Data o2) -> {
			if (o1.getName().length() < o2.getName().length()) {
				return -1;
			} else if (o1.getName().length() > o2.getName().length()) {
				return 1;
			} else {
				return 0;
			}
		});
//		Collections.sort(list, (Data o1, Data o2) -> {
//			return o1.getName().compareTo(o2.getName());
//		});
//		this does not require any full statments
//		Collections.sort(list, (Data o1, Data o2) -> o1.getName().compareTo(o2.getName()));
//		without lambda
//		Collections.sort(list, new Comparator<Data>() {
//
//			@Override
//			public int compare(Data o1, Data o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});

		for (Data data : list) {
			System.out.println(data.getName());
		}

	}

}
