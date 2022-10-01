package org.lessons;

//we can use finally without catch
//finally must be the last statement in a try catch block
//finally will always be printed
public class App {

	public static void main(String[] args) {
		int x = 2;
		try {
			System.out.println("We don't know what will be the outcome : " + x / 2);
		} catch (RuntimeException e) {
			System.out.println("Runtime exception");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("This will be printed");
		}

	}

}
