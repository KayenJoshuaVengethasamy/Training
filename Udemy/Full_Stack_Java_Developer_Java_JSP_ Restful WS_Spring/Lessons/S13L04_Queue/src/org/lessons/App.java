package org.lessons;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {
	public static void main(String[] args) {
//		LinkedBlockingQueue Integer
		System.out.println("LinkedBlockingQueue");
		Queue<Integer> queue = new LinkedBlockingQueue<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		for (Integer element : queue) {
			System.out.println(element);
		}
		System.out.println("*********************");

//		ArrayBlockingQueue Integer
		System.out.println("ArrayBlockingQueue");
//		unlike linked, you need to provide the size
		Queue<Integer> queue2 = new ArrayBlockingQueue<>(6);
//		this will display the top of the queue
		System.out.println(queue2.peek());
//		.poll is similar to remove, however it will not throw an exception if array is empty, rather it shall return null
		System.out.println(queue2.poll());
//		.offer is similar to add, however it will prevent any unnecessary array additions and will not throw an exception if array is out of bounds
		System.out.println(queue2.offer(1));
		queue2.offer(2);
		queue2.offer(3);
		queue2.offer(4);
		queue2.offer(5);
		queue2.offer(6);
		System.out.println(queue2.offer(7));
		for (Integer element : queue2) {
			System.out.println(element);
		}
//		removes and display the top element 
		System.out.println(queue2.poll());
		System.out.println("******************");
		for (Integer element : queue2) {
			System.out.println(element);
		}
		System.out.println("**********************");

		System.out.println(queue2.peek());
//		try {
//			System.out.println("First element in queue : "+queue2.element());
//		} catch (Exception e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
////		if we use the .remove() method before adding any element, it will crash
//		surround with try catch to avoid crashes
//		try {
//			queue2.remove();
//		} catch (NoSuchElementException e1) {
//			System.out.println("Queue is empty");
//		}
//		try {
//			queue2.add(1);
//			queue2.add(2);
//			queue2.add(3);
//			queue2.add(4);
//			queue2.add(5);
//			queue2.add(6);
//			queue2.add(7);
//		} catch (IllegalStateException e) {
//			System.out.println("Queue is full");
//		}
//		for (Integer element : queue2) {
//			System.out.println(element);
//		}
//		System.out.println("*********************");
//		queue2.remove();
//		System.out.println("First element in queue : "+queue2.element());
	}

}
