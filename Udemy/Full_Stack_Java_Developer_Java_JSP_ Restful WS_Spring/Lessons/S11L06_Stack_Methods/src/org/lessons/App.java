package org.lessons;

import java.util.Stack;

public class App {

	public static void main(String[] args) {
		Stack<Integer> demo = new Stack<>();
		demo.push(0);
		demo.push(1);
		demo.push(2);
		demo.push(3);
		demo.push(4);
		demo.push(5);
		demo.push(100);
//		check if stack is empty
		if(demo.isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Stack is not empty");
		}
//		find an element
		System.out.println(demo.search(56));
//		when we pop, it will be from the top of the list. Which will be the last item. Stacks are LIFO
//		demo.pop();
//		does not remove, but rather view the item at the top
//		System.out.println(demo.peek());
//		for (Integer temp : demo) {
//			System.out.println(temp);
//		}
//		compatible
//		for (int temp : demo) {
//			System.out.println(temp);
//		}

	}

}
