package org.lessons;

import java.util.HashSet;
import java.util.Set;

//when compared to lists, sets are used less in the programming world
//there a few properties for sets
//1. sets do not allow for duplicates values
//2. you can iterate through lists to retain information or you can check for a certain value as there is no index value
//3. the sequence in which the information is stored is not constant.
//sets are usually more memory efficient than lists

public class App {

	public static void main(String[] args) {
//		Hashset is the most common set
		Set<String> set = new HashSet<>();
//		adding values to set
		set.add("Kayen");
		set.add("Joshua");
		set.add("Kandier");
		set.add("Vengethasamy");
		set.add("King");
		set.add("kayen");

		for (String name : set) {
			System.out.println(name);
		}
//		how to retrieve a single value in a set. Morever to see if it exists in the set
		System.out.println(set.contains(""));

	}

}
