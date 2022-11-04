package org.lessons;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args) {
		Vehicle bike = new Vehicle("bike", 3710);
		Vehicle car = new Vehicle("bike", 485);
//		System.out.println(bike);
//		.dat stands for data type
//		when we are writing in information, the information needs to be serialized. 
//		It should not interfere with each other. As a result, we must implement the Serializable interface inside the class
//		if we don't, we will get a IOException
		try (FileOutputStream fos = new FileOutputStream("Serialization_Of_Objects\\vehicles.dat")) {
			try (ObjectOutputStream obj = new ObjectOutputStream(fos)) {
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("Object written onto the file");
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException");
		}
	}

}
