package org.lessons;

public class App {

	public static void main(String[] args) {
//		reference of an array
		int[] intVariableArray;
//		arrays start from 0
		intVariableArray = new int[10];
		intVariableArray[5]= 10;
//		this will throw an error. The last element will always be the size of the array -1
		intVariableArray[9] = 99;
		System.out.println(intVariableArray[5]);
		System.out.println(intVariableArray[8]);
		int[] anotherIntVariableArray = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(anotherIntVariableArray[5]);
		float[] floatVariableArray = {1.0f,2.0f,3.0f,4.0f};
		System.out.println(floatVariableArray[3]);

	}

}
