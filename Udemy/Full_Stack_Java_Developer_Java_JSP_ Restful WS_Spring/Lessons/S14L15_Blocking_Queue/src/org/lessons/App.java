package org.lessons;
//A blocking queue is a thread saved collection

//there will be two threads : a producer-consumer thread
//a producer thread will produce or add elements in the queue
//Simultaneously, a consumer thread will consume the elements from the queue

import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable {
	private ArrayBlockingQueue<Integer> queue;

	public Producer(ArrayBlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(5000);
				queue.put(App.counter++);
				System.out.println("Value added in the queue : " + App.counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class Consumer implements Runnable {
	private ArrayBlockingQueue<Integer> queue;

	public Consumer(ArrayBlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				queue.take();
				App.counter--;
				System.out.println("Value removed in the queue : " + App.counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

public class App {
	static int counter = 0;

	public static void main(String[] args) {
//		because it is a thread safe queue, the array will not reach its maximum capacity and rather it will wait for more info
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
		Producer produce = new Producer(queue);
		Thread producerThread = new Thread(produce);
		producerThread.start();

		Consumer consume = new Consumer(queue);
		Thread consumerThread = new Thread(consume);
		consumerThread.start();

	}

}
