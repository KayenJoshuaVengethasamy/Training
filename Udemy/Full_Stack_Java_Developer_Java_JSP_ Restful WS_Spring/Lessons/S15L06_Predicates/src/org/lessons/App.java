package org.lessons;

import java.util.function.IntPredicate;

public class App {
	public static void main(String[] args) {
//		using lambda on a predicate
		IntPredicate lessThan18 = i -> i < 18;
		System.out.println(lessThan18.test(12));
		IntPredicate moreThan10 = i -> i > 10;
//		to use both predicates
		System.out.println(lessThan18.and(moreThan10).test(1));
		System.out.println(lessThan18.or(moreThan10).test(45));
//		IntPredicate lessThan18 = new IntPredicate() {
//
//			@Override
//			public boolean test(int value) {
//
//				if (value < 18) {
//					return true;
//				} else {
//					return false;
//				}
//			}
//		};
//		
//		System.out.println(lessThan18.test(22));
	}

}
