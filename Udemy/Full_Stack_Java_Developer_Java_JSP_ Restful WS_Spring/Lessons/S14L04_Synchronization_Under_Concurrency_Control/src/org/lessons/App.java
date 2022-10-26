package org.lessons;
// a synchronized element will restrict multiple threads from working on an element simultaneously 
public class App {
	
	public static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					App.counter++;
				}
				System.out.println("The loop in thread 1 is over");
			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					App.counter++;
				}
				System.out.println("The loop in thread 2 is over");
			}
		});
		thread1.start();
		thread2.start();
		Thread.sleep(2000);
		System.out.println("The value of counter is : " + App.counter);
		System.out.println("************");

	}

}
