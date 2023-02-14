package org.lessons;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//reentrant lock is a locking mechanism and by using it, we can apply a restriction on multiple threads so they cannot run simultaneously
//provides better control and it is all manual
//it will also help prevent deadlocks
public class App {
	static int counter = 0;
//	can be anything, not necessarily static
	static Lock lock = new ReentrantLock();

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				lock.lock();
//				try catch blocks ensure that the lock will always be unlocked in the case of an exception, catch is optional
				try {
					for (int i = 1; i <= 1000; i++) {
						App.counter++;
					}
				} finally {

					lock.unlock();

				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				lock.lock();
				try {

					for (int i = 1; i <= 1000; i++) {
						App.counter++;
					}
				} catch (Exception e) {
					System.out.println("Error : " + e);
				} finally {

					lock.unlock();

				}
			}
		});

		thread1.start();
		thread2.start();
//		our main method will wait until the two threads are completed
		thread1.join();
		thread2.join();
		System.out.println("The final value of counter is : " + App.counter);
	}

}
