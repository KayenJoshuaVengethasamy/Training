package org.lessons;

import java.io.FileNotFoundException;
import java.io.FileReader;

//java has two types of exceptions:
//	1. checked
//		These are checked by java, you need to handle it
//	2. unchecked
//		These are not checked by java and you can handle it according to your needs. These are not so serious

public class App {

	public static void main(String[] args) {

//		checked exception
		try {
			FileReader in = new FileReader("file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		unchecked exception
		int x = 10, y;
		y = x / 0;
		System.out.println(y);

	}

}
