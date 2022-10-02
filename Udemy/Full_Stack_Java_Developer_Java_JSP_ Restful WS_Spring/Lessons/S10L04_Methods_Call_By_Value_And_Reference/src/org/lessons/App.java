package org.lessons;

public class App {

	public static void main(String[] args) {
		
//		call by value
//		int value = 10;
//		System.out.println("Current value of variable in main method is : " + value);
//		App app = new App();
//		app.displayValue(value);
//		System.out.println("Current value of variable in main method is : " + value);
		
//		call by reference
//		the concept of passing the address and not the value of the variable
		String[] names = { "Kayen", "Joshua", "Kandier", "Vengethasamy", "DragonWolf" };
		App app = new App();
//		this will print the address of first memory allocation of the array
//		System.out.println(names);
//		we are directly passing in the address
		app.displayNames(names);
		System.out.println("***********************");
		System.out.println(names[0]);

	}

//	void displayValue(int value) {
//		System.out.println("Current value of variable in displayValue method is : " + value);
//		value = 20;
//		System.out.println("Current value of variable in displayValue method is " + value);
//	}
	void displayNames(String[] names) {
		names[0] = "Demon";
		System.out.println("***********************");
		for (String name : names) {
			System.out.println(name);
		}
//	we are directly updating the information in the address location 
		names[0] = "King";
	}

}
