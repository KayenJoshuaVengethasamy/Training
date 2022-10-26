package org.lessons;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {
	public static void main(String[] args) {
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
//		This will most likely not cause a deadlock
//		Thread thread1 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				lock1.lock();
//				System.out.println("Inside thread1 on lock1");
//				lock2.lock();
//				System.out.println("Inside thread1 on lock2");
//				lock2.unlock();
//				lock1.unlock();
//			}
//		});
//		Thread thread2 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				lock1.lock();
//				System.out.println("Inside thread2 on lock1");
//				lock2.lock();
//				System.out.println("Inside thread2 on lock2");
//				lock2.unlock();
//				lock1.unlock();
//			}
//		});
//		This will most likely cause a deadlock
//		Thread thread1 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				lock1.lock();
//				System.out.println("Inside thread1 on lock1");
//				lock2.lock();
//				System.out.println("Inside thread1 on lock2");
//				lock2.unlock();
//				lock1.unlock();
//			}
//		});
//		Thread thread2 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				lock2.lock();
//				System.out.println("Inside thread2 on lock1");
//				lock1.lock();
//				System.out.println("Inside thread2 on lock2");
//				lock2.unlock();
//				lock1.unlock();
//			}
//		});

//		getting rid of the deadlock with timed tryLock
//		Thread thread1 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				boolean flagLock1 = false;
//				boolean flagLock2 = false;
//				while (true) {
//					try {
//						flagLock1 = lock1.tryLock(10, TimeUnit.MILLISECONDS);
//						flagLock2 = lock2.tryLock(10, TimeUnit.MILLISECONDS);
//
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					} finally {
//						if (flagLock1) {
//							System.out.println("Inside thread1 on lock1");
//							lock1.unlock();
//						}
//						if (flagLock2) {
//							System.out.println("Inside thread1 on lock2");
//							lock2.unlock();
//						}
//						if (flagLock1 && flagLock2) {
//							break;
//						}
//					}
//				}
//			}
//		});
//		Thread thread2 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				boolean flagLock1 = false;
//				boolean flagLock2 = false;
//				while (true) {
//					try {
//						flagLock1 = lock1.tryLock(10, TimeUnit.MILLISECONDS);
//						flagLock2 = lock2.tryLock(10, TimeUnit.MILLISECONDS);
//
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					} finally {
//						if (flagLock1) {
//							System.out.println("Inside thread2 on lock1");
//							lock1.unlock();
//						}
//						if (flagLock2) {
//							System.out.println("Inside thread2 on lock2");
//							lock2.unlock();
//						}
//						if (flagLock1 && flagLock2) {
//							break;
//						}
//					}
//				}
//			}
//		});

//		getting rid of the deadlock with tryLock, which could result in some issues. This can resolved with more flags or if condition
//		Thread thread1 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				boolean flagLock1 = false;
//				boolean flagLock2 = false;
//				boolean doneFlag1 = false;
//				boolean doneFlag2 = false;
//				while (true) {
//					try {
//						flagLock1 = lock1.tryLock();
//						flagLock2 = lock2.tryLock();
//					} finally {
//						if (flagLock1 && !doneFlag1) {
//							System.out.println("Inside thread1 on lock1");
//							lock1.unlock();
//							doneFlag1 = true;
//						}
//						if (flagLock2 && !doneFlag2) {
//							System.out.println("Inside thread1 on lock2");
//							lock2.unlock();
//							doneFlag2 = true;
//						}
//						if (flagLock1 && flagLock2) {
//							break;
//						}
//					}
//				}
//			}
//		});
//		Thread thread2 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				boolean flagLock1 = false;
//				boolean flagLock2 = false;
//				boolean doneFlag1 = false;
//				boolean doneFlag2 = false;
//				while (true) {
//					try {
//						flagLock1 = lock1.tryLock();
//						flagLock2 = lock2.tryLock();
//					} finally {
//						if (flagLock1 && !doneFlag1) {
//							System.out.println("Inside thread2 on lock1");
//							lock1.unlock();
//							doneFlag1 = true;
//						}
//						if (flagLock2 && !doneFlag2) {
//							System.out.println("Inside thread2 on lock2");
//							lock2.unlock();
//							doneFlag2 = true;
//						}
//						if (flagLock1 && flagLock2) {
//							break;
//						}
//					}
//				}
//			}
//		});
//		getting rid of the deadlock with tryLock, which could result in some issues. This can resolved with more flags or if condition
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				boolean flagLock1 = false;
				boolean flagLock2 = false;
				boolean doneFlag1 = false;
				boolean doneFlag2 = false;
				while (true) {
					try {
						if (!flagLock1) {

							flagLock1 = lock1.tryLock();
						}
						if (!flagLock2) {

							flagLock2 = lock2.tryLock();
						}
					} finally {
						if (flagLock1 && !doneFlag1) {
							System.out.println("Inside thread1 on lock1");
							lock1.unlock();
							doneFlag1 = true;
						}
						if (flagLock2 && !doneFlag2) {
							System.out.println("Inside thread1 on lock2");
							lock2.unlock();
							doneFlag2 = true;
						}
						if (flagLock1 && flagLock2) {
							break;
						}
					}
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				boolean flagLock1 = false;
				boolean flagLock2 = false;
				boolean doneFlag1 = false;
				boolean doneFlag2 = false;
				while (true) {
					try {
						if (!flagLock1) {

							flagLock1 = lock1.tryLock();
						}
						if (!flagLock2) {

							flagLock2 = lock2.tryLock();
						}
					} finally {
						if (flagLock1 && !doneFlag1) {
							System.out.println("Inside thread2 on lock1");
							lock1.unlock();
							doneFlag1 = true;
						}
						if (flagLock2 && !doneFlag2) {
							System.out.println("Inside thread2 on lock2");
							lock2.unlock();
							doneFlag2 = true;
						}
						if (flagLock1 && flagLock2) {
							break;
						}
					}
				}
			}
		});

		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("I am inside main method");

	}
}
