package org.lessons;

public class App {
	static public int balance = 5000;

	public void withdraw(int amount) {
		synchronized (this) {
			if (balance <= 0 || balance < amount) {
				try {
					System.out.println("Waiting for balance updation R" + balance);
					wait();
				} catch (InterruptedException e) {
					System.out.println("Original balance : R" + balance);
					System.out.println("Withdrawal amount : R" + amount);
					balance = balance - amount;
					System.out.println("Withdrawal successful R" + balance);
//					System.out.println("Thread got interrupted");
//					return;
				}
			} else {
				System.out.println("We are inside else");
			}
		}
	}

	public void deposit(int amount) {
		System.out.println("We are depositing the amount R" + amount);
		balance = balance + amount;
	}

	public static void main(String[] args) {
		App app = new App();

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				app.withdraw(1000);
			}
		});
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
				thread1.interrupt();
			}
		});
		thread2.start();
	}
}

//		throwing the exception after a certain period has passed 
//		if (balance <= 0) {
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			whenever we call the interrupt method, we have to have the reference
//			thread1.interrupt();
//		}
//		creating a thread using an anonymous class, we cannot use interrupt method
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				app.withdraw(1000);
//			}
//		}).start();
//		if (balance <= 0) {
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
