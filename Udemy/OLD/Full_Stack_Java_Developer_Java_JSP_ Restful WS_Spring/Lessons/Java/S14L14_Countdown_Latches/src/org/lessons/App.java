package org.lessons;

import java.util.concurrent.CountDownLatch;

class SomeThread extends Thread {
	private CountDownLatch latch;

	public SomeThread(CountDownLatch latch) {
		super();
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Thread running with thread name : " + Thread.currentThread().getName());
		System.out.println("Thread Execution completed");
		System.out.println("*********************************************************************");
//		this will prevent the program running indefintely. It will release the latch and allow the main thread to run
//		This will countdown and unfold the latch the fold once
		latch.countDown();
	}
}

public class App {
	public static void main(String[] args) {
//		this is a locking mechanism which can be used to apply to other threads as well
//		the number in parenthesis indicates how many folds there are
//		in order to release the lock, we need to unfold the latch
//		only then will the await method will release the lock
//		as soon as this is done, the main thread will execute and terminate the program
		CountDownLatch latch = new CountDownLatch(0);
		SomeThread thread1 = new SomeThread(latch);
		SomeThread thread2 = new SomeThread(latch);
		SomeThread thread3 = new SomeThread(latch);
		SomeThread thread4 = new SomeThread(latch);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
//		this will force the main thread to wait until the lock is released
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I am in main thread : "+ Thread.currentThread().getName());

	}
}
