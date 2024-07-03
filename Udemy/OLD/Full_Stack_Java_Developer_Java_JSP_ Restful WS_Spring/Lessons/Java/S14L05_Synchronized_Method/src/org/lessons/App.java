package org.lessons;

//There are three types of synchronization available : 
//	1. synchronized methods
//	2. synchronized block
//	3. static synchronization
class Brakets {
//	to prevent the method to get executed on multiple threads simultaneously 
//	a synchronized method prevents this
	synchronized public void generate() {
		for (int i = 1; i <= 10; i++) {
			if (i <= 5) {
				System.out.print("[");
			} else {
				System.out.print("]");
			}
		}
		System.out.println();
	}
}

public class App {
	public static void main(String[] args) {
//		the solution will not work on multiple objects, local copies of object or different objects
//		The reason for this is because when we mark a specific element as synhronized, a lock will be applied. This lock is specific to objects
//		whenever we are using different objects, there is a different lock, there are multiple locks
		Brakets braket1 = new Brakets();
		Brakets braket2 = new Brakets();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					braket1.generate();
				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					braket2.generate();
				}
			}
		}).start();
//		Brakets braket = new Brakets();
//		braket.generate();
//		because there are multiple threads, we will get unexpected results because we are executing the method on multiple threads
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				for (int i = 1; i <= 5; i++) {
//					braket.generate();
//				}
//			}
//		}).start();
//		
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				for (int i = 1; i <= 5; i++) {
//					braket.generate();
//				}
//			}
//		}).start();

	}

}
