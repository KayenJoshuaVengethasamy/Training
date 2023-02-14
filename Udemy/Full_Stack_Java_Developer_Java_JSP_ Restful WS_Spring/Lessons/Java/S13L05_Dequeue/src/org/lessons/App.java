package org.lessons;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class App {
	public static void main(String[] args) {
//		if you use the same operations as queue in deque, there will not be any difference between the two as well as no issues
//		the most useful collections are lists and maps therefore they are the most commonly seen
		Deque<Integer> deque = new LinkedBlockingDeque<>();
		deque.offer(1);
		deque.offer(2);
		deque.offer(3);
		deque.offer(4);
		deque.offer(5);
		deque.offer(6);
		deque.offer(7);
		for (Integer element : deque) {
			System.out.println(element);
		}
		System.out.println("*****************************************************************");
//		adds to the front of the queue
		deque.addFirst(0);
//		this will remove from the end(tail) of the queue
		deque.removeLast();
		for (Integer element : deque) {
			System.out.println(element);
		}
		System.out.println("*****************************************************************");

	}

}
