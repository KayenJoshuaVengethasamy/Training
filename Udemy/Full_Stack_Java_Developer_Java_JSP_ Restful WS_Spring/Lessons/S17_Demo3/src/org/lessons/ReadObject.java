package org.lessons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String[] args) {
		try (FileInputStream FIO = new FileInputStream("Demo3\\vehicles.dat")) {
			try (ObjectInputStream obj = new ObjectInputStream(FIO)) {
				Vehicle v1 = (Vehicle) obj.readObject();
				Vehicle v2 = (Vehicle) obj.readObject();
				System.out.println(v1);
				System.out.println(v2);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
