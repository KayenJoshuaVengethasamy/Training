package org.lessons;

public class App {

	public static void main(String[] args) {

		String[] stringArray = { "Kayen", "Joshua", "Kandier", "Vengethasamy", "DragonWolf" };
		System.out.println(stringArray[0]);
		System.out.println(stringArray[1]);
		System.out.println(stringArray[2]);
		System.out.println("***************************************");
//		using a for loop to access an array of a known size
		for(int i=0; i<=4; i++) {
			System.out.println(stringArray[i]);
		}
		System.out.println("***************************************");		
//		when we dont know the size of the array
//		this will display the exact length of the array
		System.out.println(stringArray.length);
		for(int i=0; i<=stringArray.length-1; i++) {
			System.out.println(stringArray[i]);
		}
		System.out.println("***************************************");		
		for(int i=0; i<stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		System.out.println("***************************************");		
//		using a foreach loop
//		for(dataType of temporary variable[must be compatible with array] : name of array)
//		foreach was introduced post java version 8
		for(String name: stringArray) {
			System.out.println(name);
		}
		
	}

}
