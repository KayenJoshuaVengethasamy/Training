package org.lessons;

//without the notify method, the wait method will run indefinitely unless we use the paramatized version of wait method
public class App {
	static public int balance = 0;

	public void withdraw(int amount) {
//		this pair of braces will be synchronized and we need to specify the object on which it will be synchonized
		synchronized (this) {
			if (balance <= 0) {
//		wait method will enter the current thread in the waiting phase. As a result, the thread will stop executing
//		meanwhile, the thread calls the notify method
//		wait and notify need to be enclosed in a synchronized method or block
				try {
					System.out.println("Waiting for balance updation R"+balance);
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
//		we will not be using the else statement because of the wait method preventing the execution of the below statement
		balance = balance - amount;
		System.out.println("Withdrawal successful R" + balance);
	}

	public void deposit(int amount) {
		System.out.println("We are depositing the amount R"+amount);
		balance = balance + amount;
//		notifyall method lock on all the waiting methods on a specific object will be released 
//		notify method lock on only one waiting method on a specific object will be released 
//		similar to wait, we need to add a synchronised block
		synchronized (this) {
			notify();
		}
	}

	public static void main(String[] args) {
		App app = new App();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				app.withdraw(1000);
			}
		});
		thread1.setName("Thread 1");
		thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				app.deposit(2000);
			}
		});
		thread2.setName("Thread 2");
		thread2.start();
	}

}
