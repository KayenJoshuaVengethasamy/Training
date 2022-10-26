package org.lessons;

import java.util.Random;

class MyCounter implements Runnable {
	private int threadNo;

	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		Random random = new Random();

		for (int i = 0; i <= 9; i++) {
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The value of i is : " + i + " and the thread number is : " + threadNo);
		}
	}

}

public class App {

	public static void main(String[] args) {
//		This will not work anymore
//		MyCounter counter1 = new MyCounter(1);
//		MyCounter counter2 = new MyCounter(2);
//		This is how it is done when runnable interface is used
//		Thread thread1 = new Thread(new MyCounter(1));
//		Thread thread2 = new Thread(new MyCounter(2));
//		thread1.start();
//		thread2.start();
//		only one thread and immediate execution without a handle
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i <= 10; i++) {
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println("The value of i is : " + i);
//				}
//			}
//		}).start();
//		only one thread and immediate execution WITH a handle
//		we are initializing this object and also starting
//		when we call the start method, we will not be able to recieve handle, because start() will return a void
//		solution is to not call start immediately
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("The value of i is : " + i);
				}
			}
		});
		thread.start();

	}

}
