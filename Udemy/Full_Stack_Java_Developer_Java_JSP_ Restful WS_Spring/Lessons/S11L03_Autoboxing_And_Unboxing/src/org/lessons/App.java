package org.lessons;

import java.util.ArrayList;

//	the first solution is a wrapper class
//	a wrapper class works on a single entity and for that single entity, we will have the parametised constructor and the getter and setters
class intWrapper {
	public int intValue;

	public intWrapper(int intValue) {
		// use super when inheriting and the class is independent
		// super();
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

}

public class App {

	public static void main(String[] args) {
		ArrayList<Double> demoList = new ArrayList<>();
//		what is special about wrapper class is that we can directly add the values without any other class or conversion. This is autoboxing in the background
//		Double is a class
//		demoList.add(25.5);
//		to add the values manually, there are two ways:
//		way 1 is to use an object
//		demoList.add(new Double(25.2));
//		way 2. This is the method used in the background when autoboxing is used
		demoList.add(Double.valueOf(10.2));
//		unboxing
//		this is how the programmer will code the program
//		System.out.println(demoList.get(0));
//		unboxing in the background done by Java
		System.out.println(demoList.get(0).doubleValue());

//		there is an error and this is because of the int type
//		This is because an arraylist can contain a list of objects only and int is a primitive data type
//		ArrayList<int> studentNumbers = new ArrayList<>();
//		first solution to resolve this issue is to use a wrapper for int
//		check outter class for this
//		if we make use a custom wrapper class, boxing and unboxing needs to be implemented manually
//		ArrayList<intWrapper> studentNumbers = new ArrayList<>();
//		boxing:
//		we are converting a prmitive data into an object
//		studentNumbers.add(new intWrapper(12));
//		second, the better one, is to use a wrapper class that is available to us
//		There is an equivalent wrapper class for every primitive type
//		The reason this worked is because String is not a primitive data type but rather its own class
//		ArrayList<String> studentNumbers = new ArrayList<>();	
//		The reason why this primitive object is working as a primitive data type is because of autoboxing and unboxing working in the background
//		ArrayList<Integer> studentNumbers = new ArrayList<>();
//		Autoboxing
//		We do not any method to convert like with boxing to convert a primitive type to an object
//		This is because Java does it automatically
//		studentNumbers.add(25);
//		System.out.println(studentNumbers.get(0));
//		converting object to primitive type is known as unboxing
//		System.out.println(studentNumbers.get(0).getIntValue());//unboxing

	}

}
