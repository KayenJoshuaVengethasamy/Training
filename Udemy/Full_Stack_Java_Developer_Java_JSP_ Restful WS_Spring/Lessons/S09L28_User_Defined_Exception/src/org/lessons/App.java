package org.lessons;

import java.io.FileNotFoundException;

class UserDefinedException extends Throwable {

}

public class App {

	public static void main(String[] args) {
		try {
			someMethod();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Catch block of main method");
		} catch (UserDefinedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Catch block of main method(Exception)");
		}
	}

	public static void someMethod() throws Exception, FileNotFoundException, UserDefinedException {
		int x = 3;
		switch (x) {
		case 1:
			throw new FileNotFoundException();
		case 2:
			throw new Exception();
		default:
			throw new UserDefinedException();
		}
	}

}
