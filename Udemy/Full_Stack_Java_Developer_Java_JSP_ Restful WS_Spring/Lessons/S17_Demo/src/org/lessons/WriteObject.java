package org.lessons;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args) {
		Vehicle bike = new Vehicle("bike", 3710);
		Vehicle car = new Vehicle("bike", 485);
		try (FileOutputStream fos = new FileOutputStream("Demo\\vehicles.dat")) {
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
