package org.lessons;

//Lambda expressions can be used for functional type interfaces only
//a functional type interface is an interface that only contains only one and exactly one abstract method
//this is a functional interface
//interface Lambda {
//	public void demo();
//}
//this wiil not work for lambda
//interface Lambda {
//	public void demo();
//
//	public void demo2(int x);
//}

public class App {
	public static void main(String[] args) {
//		using lambda on a thread
//		quickest way to start a thread
		new Thread(() -> {
			System.out.println("I am inside thread1");
			System.out.println("This is line2             ");
		}).start();
//		Thread thread1 = new Thread(() ->{
//			System.out.println("I am inside thread1");
//			System.out.println("This is line2             ");	
//		});
//		thread1.start();
//		Thread thread1 = new Thread(() -> System.out.println("I am inside thread1"));
//		thread1.start();

//		Thread thread1 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("I am inside thread1");
//			}
//		});
//		thread1.start();
//this will crash if it is not a functional interface
//		Lambda lambda = () -> {
//			System.out.println("Statement 1");
//			System.out.println("Statement 2");
//		};
//		lambda.demo();
//
//	}

	}
}
