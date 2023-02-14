package org.lessons;

//class variables as well as local variables that are local to the method variable are available to lambda
interface Lambda {
	abstract public int demo();
}

public class App {
//	static int x = 10;

	public static void main(String[] args) {

		Lambda lambda = () -> {
			System.out.println("Statement 1");
			return (10/3);	
		};
		System.out.println(lambda.demo());
//		if there is one statement that is being returned, we can do it as follows
//		Lambda lambda = () -> (10/3);
//		System.out.println(lambda.demo());
//		Lambda lambda = () -> {
//			System.out.println("We will return something");
//			return 10;
//		};
//		System.out.println(lambda.demo());
		
//		Lambda lambda = (int x, float y) -> {
//			System.out.println("The value of x is : " + x + " and the value of y is : " + y);
//			System.out.println("Statement from demo method");
//		};
//		lambda.demo(201, 50.1F);
//		int x = 10;
//		when we make use of anonymous inner class, or lambda expressions. they are passed in different ways 
//		Lambda lambda = new Lambda() {

//			@Override
//			public void demo() {
//				int test = 101;
//				System.out.println("Value of x : " + test);
//				System.out.println("Value of x : " + x);

//			}
//		};

//		lambda.demo();

//		out of scope, will crash
//		System.out.println(test);
//		still in scope
//		int j = 10;
//		{
//			still in scope
//			int j = 10;
//			System.out.println("Value of j is : " + j);
//		}
//		out of scope
//		int j = 10;

	}

}
