package org.lessons;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
//		HashSet Integer
		System.out.println("HashSet Integer : ");
		Set<Integer> set = new HashSet<>();
		for (int i = 30; i > 0; i--) {
			set.add(i);
		}
		for (int i : set) {
			System.out.println(i);
		}
		System.out.println("***********************");
//		LinkedHashSet Integer
		System.out.println("LinkedHashSet Integer : ");
		Set<Integer> set2 = new LinkedHashSet<>();
		for (int i = 30; i > 0; i--) {
			set2.add(i);
		}
		for (int i : set2) {
			System.out.println(i);
		}
		System.out.println("***********************");
//		TreeSet Integer
		System.out.println("TreeSet Integer: ");
		Set<Integer> set3 = new TreeSet<>();
		for (int i = 30; i > 0; i--) {
			set3.add(i);
		}
		for (int i : set3) {
			System.out.println(i);
		}
		System.out.println("***********************");
//		HashSet String
		System.out.println("HashSet String : ");
		Set<String> set4 = new HashSet<>();
		for (int i = 30; i > 0; i--) {
			set4.add("K" + i);
		}
		for (String i : set4) {
			System.out.println(i);
		}
		System.out.println("***********************");
//		LinkedHashSet String
		System.out.println("LinkedHashSet String : ");
		Set<String> set5 = new LinkedHashSet<>();
		for (int i = 30; i > 0; i--) {
			set5.add("K" + i);
		}
		for (String i : set5) {
			System.out.println(i);
		}
		System.out.println("***********************");
//		TreeSet String
		System.out.println("TreeSet String : ");
		Set<String> set6 = new TreeSet<>();
		for (int i = 30; i > 0; i--) {
			set6.add("K" + i);
		}
		for (String i : set6) {
			System.out.println(i);
		}
		System.out.println("***********************");
	}

}
