package org.lessons;

public class App {
	public static void main(String[] args) {
		String lock1 = "lock1";
		String lock2 = "lock2";
//		This is safe and will not create a deadlock
//		Thread thread1 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				synchronized (lock1) {
//					System.out.println("Inside thread1 on lock1");
//					synchronized (lock2) {
//						System.out.println("Inside thread1 on lock2");
//
//					}
//				}
//
//			}
//		});
//		Thread thread2 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				synchronized (lock1) {
//					System.out.println("Inside thread2 on lock1");
//					synchronized (lock2) {
//						System.out.println("Inside thread2 on lock2");
//
//					}
//				}
//
//			}
//		});
//		altering the sequence will create a deadlock, be careful
//		This is because of intersection
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lock1) {
					System.out.println("Inside thread1 on lock1");
					synchronized (lock2) {
						System.out.println("Inside thread1 on lock2");

					}
				}

			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lock2) {
					System.out.println("Inside thread2 on lock2");
					synchronized (lock1) {
						System.out.println("Inside thread2 on lock1");

					}
				}

			}
		});
//		have to be before the join statements
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("I am inside main method");

	}
}
