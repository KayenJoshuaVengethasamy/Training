package org.lessons;

import java.util.ArrayList;
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
//		using a foreach loop with reference to custom objects
		List<Data> list = new ArrayList<>();
		list.add(new Data("Kayen"));
		list.add(new Data("Joshua"));
		list.add(new Data("Kandier"));
		list.add(new Data("Vengethasamy"));
		list.add(new Data("KJV"));
		list.forEach(temp -> {
			System.out.println(temp.getName());
		});
//		List<Integer> list = new ArrayList<>();
//		list.add(37);
//		list.add(10);
//		list.add(48);
//		list.add(5);
//		list.add(2);
//		list.add(6);
//		list.add(9);

//		another type of for loop
//		in the foreach loop, a lambda expression can be passed in the parenthesis
//		this expression is smart. We start with a temporary variable name which does not require a data type, it is determined automatically, 
//		the lambda arrow and then a statement. If in the loop there is only one statement, then there is no need for braces and a single statement will work
//		if you want to add restrictions etc, use braces
//		this is an enhanced foreach
//		list.forEach(i->System.out.println(i));
//		list.forEach(i -> {
//			if (i >= 10) {
//				System.out.println(i);
//
//			}
//		});		
//		Enhanced for loop
//		for (Integer i : list) {
//			if (i >= 10) {
//				System.out.println(i);
//
//			}
//		}
//		as soon as a variable is final, no changes can be made to that variable
//		an effectively final variable is a variable were we don't make any further changes once the value is initialized
//		final int x = 10;
//		if we perform  any operation on a variable such as incrementing, the system will fail if used for a lambda expression
//		the major reason for this is because, it could happen because when we are executing this operation, it might happen the execution is different 
//		because the operation is on thread and it may be executed in another thread before the lambda operation executes in the background
//		x++;
//		new Thread(() -> System.out.println("The value of x is : " + x)).start();
	}

}
