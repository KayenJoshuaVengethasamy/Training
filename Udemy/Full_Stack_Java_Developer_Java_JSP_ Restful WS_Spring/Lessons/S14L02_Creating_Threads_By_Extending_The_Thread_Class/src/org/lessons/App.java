package org.lessons;

class MyCounter extends Thread {
	private int threadNo;

	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}

//	already exists in thread class
	@Override
	public void run() {
		countMe();
	}

	public void countMe() {
		for (int i = 1; i <= 9; i++) {
//			stop the process for a specific time in ms
//			it might throw an exception, so surround with try catch
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The value of i is : " + i + " and the thread number is : " + threadNo);
		}
	}

}

public class App {

	public static void main(String[] args) {
//		MyCounter counter1 =new MyCounter(1);
//		MyCounter counter2 =new MyCounter(2);
//		calculate the total amount of time for the entire process
//		long startTime = System.currentTimeMillis();
//		counter1.countMe();
//		System.out.println("**********************");
//		counter2.countMe();
//		calculate the total amount of time for the entire process
//		long endTime = System.currentTimeMillis();
//		System.out.println("Total time required to process : " + (endTime-startTime));

		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);
		long startTime = System.currentTimeMillis();
//		run should be called by JVM instead of us
//		counter1.run();
//		using start makes it a multithreaded application and the total time will change as both counter1 and counter2 are running at the same time
		counter1.start();
		System.out.println("**********************");
		counter2.start();
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time required to process : " + (endTime - startTime));

	}

}
