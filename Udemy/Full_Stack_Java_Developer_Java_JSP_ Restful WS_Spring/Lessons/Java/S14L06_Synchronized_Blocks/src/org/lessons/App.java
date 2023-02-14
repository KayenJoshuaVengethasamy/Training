package org.lessons;

class Brakets {
	private Object lock = "lock";
	synchronized public void generate() {
//		to synchronize a specific part of a class or method, we can use synchronization blocks
//		synchronized (this) will only synchronize the block, this can also be an object. Using an object is the recommended way
		synchronized (lock){
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i <= 5) {
				System.out.print("[");
			} else {
				System.out.print("]");
			}
		}
		System.out.println();
		}
		
		for (int j = 0; j <= 10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class App {
	public static void main(String[] args) {
		Brakets braket = new Brakets();
		new Thread(new Runnable() {
			@Override
			public void run() {
				long starttime = System.currentTimeMillis();
				for (int i = 1; i <= 5; i++) {
					braket.generate();
				}
				long endTime = System.currentTimeMillis();
//				how long the thread took to execute
				System.out.println("Time required for thread 1 was : " + (endTime - starttime));
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				long starttime = System.currentTimeMillis();
				for (int i = 1; i <= 5; i++) {
					braket.generate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time required for thread 2 was : " + (endTime - starttime));
			}
		}).start();
	}

}
