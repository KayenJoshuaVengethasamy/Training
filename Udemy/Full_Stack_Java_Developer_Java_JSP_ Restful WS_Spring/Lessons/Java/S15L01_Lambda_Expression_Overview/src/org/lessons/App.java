package org.lessons;
//Lambda is a way to pass a definition of a specific method

//Lambda expressions are about reducing the number of statements and reducing confusion

interface Lambda {
	public void demo();
}

public class App {
	public static void main(String[] args) {
//		Lambda will simplify the below
//		Lambda lamda = new Lambda() {
//			we are using an interface, an interface only has a declaration and the definition needs to be passed explicitly
//			this is why we override
//			@Override
//			public void demo() {
//
//				System.out.println("Statement 1");
//
//			}
//		};
//
//		lambda.demo();
//		using lambda

		Lambda lambda = () -> System.out.println("Statement 1");
		lambda.demo();

//		using lambda for multiple statements
		Lambda lambda2 = () -> {
			System.out.println("Statement 1");
			System.out.println("Statement 2");
		};
		lambda2.demo();
//		if you are using this notation, which is common
		Lambda lambda3 = (() -> System.out.println("Statement 1"));
		lambda3.demo();
	}

}
