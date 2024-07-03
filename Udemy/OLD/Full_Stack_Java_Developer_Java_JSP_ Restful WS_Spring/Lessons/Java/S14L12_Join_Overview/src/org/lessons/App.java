package org.lessons;

public class App {
	public int counter = 0;

	public static void main(String[] args) {
		App app = new App();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					app.counter++;
				}

			}
		});
//		thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
//				we will join thread2 with thread1, allowing thread2 to wait until thread1 is completed
				try {
					thread1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i < 1000; i++) {
					app.counter++;
				}

			}
		});
//		this will alter the results
		thread1.start();
		thread2.start();
//		any other thread can also call the join method
//		this is a synchronised process where the main method will wait for thread2 to complete, which is currently waiting for thread1 to complete
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		using sleep is not an effective way to make use of memory as the iteration may take longer than the sleep time
//		The efficient way to resolve this is to use join method
//		join method will join the current thread with the thread with the reference 
//		try {
//		this call to join method is part of the main thread. As a result the main thread and thread1 will join 
//		reference are very important. Join is derived by the reference of the thread
//		the impact will be that the main thread will wait until the subthread has completed and then it will execute 
//			thread1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("The value of counter : " + app.counter);

	}

}
