package org.lessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

class Name implements Comparable<Name> {
	private String name;

	public Name(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Name o) {
		return getName().compareTo(o.getName());
	}

}

public class App {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayBlockingQueue<>(6);
		queue.offer(1);
		queue.offer(6);
		queue.offer(7);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);

		for (Integer element : queue) {
			System.out.println("queue item : " + element);
		}
		List<Integer> qList = new ArrayList<>();
//		This will add a collection to another collection
		qList.addAll(queue);

		for (Integer element : qList) {
			System.out.println("list item : " + element);
		}

		System.out.println("**************************************************************");

		Set<String> set = new HashSet<>();
		set.add("Kayen");
		set.add("Joshua");
		set.add("Kandier");
		set.add("Vengethasamy");
		set.add("Suzuki");
		set.add("Ciaz");

		for (String name : set) {
			System.out.println("set item : " + name);
		}
		List<String> list = new ArrayList<>();
//		This is a bulk operation
		list.addAll(set);
		Collections.sort(list);

		for (String name : list) {
			System.out.println("list item : " + name);
		}
//		binarySearch is able to search through collections where collections is the parent class but not maps
		System.out.println("Binary search : " + Collections.binarySearch(list, "Kayen"));
		System.out.println("Validate binary search : " + list.get(3));
		System.out.println("**************************************************************");

		Set<Name> set2 = new HashSet<>();
		set2.add(new Name("Kayen"));
		set2.add(new Name("Joshua"));
		set2.add(new Name("Kandier"));
		set2.add(new Name("Vengethasamy"));
		set2.add(new Name("Suzuki"));
		set2.add(new Name("Ciaz"));

		for (Name name : set2) {
			System.out.println("set2 item : " + name);
		}
		List<Name> list2 = new ArrayList<>();
//		It will not sort if we do not implement the comparable interface
		list2.addAll(set2);
		Collections.sort(list2);

		for (Name name : list2) {
			System.out.println("list2 item : " + name);
		}
//		binarySearch is not able to search if we do not implement the comparable interface
		System.out.println("Binary search : " + Collections.binarySearch(list2, new Name("Ciaz")));
		System.out.println("Validate binary search : " + list2.get(-9));
		System.out.println("**************************************************************");
	}

}
