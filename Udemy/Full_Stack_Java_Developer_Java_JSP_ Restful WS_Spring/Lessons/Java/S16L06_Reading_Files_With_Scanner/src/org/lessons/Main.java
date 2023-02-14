package org.lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//alternate method to read files
public class Main {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("test.txt"));
			String line;
			while(sc.hasNext()) {
				line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR WHILE READING FILE");
		}

	}

}
