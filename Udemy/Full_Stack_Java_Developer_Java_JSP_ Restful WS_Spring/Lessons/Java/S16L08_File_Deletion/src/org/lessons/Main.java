package org.lessons;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File file = new File("File_Deletion\\team.txt");
//		if delete was successful
		if (file.delete()) {
			System.out.println("DELETE SUCCESFUL");
		} else {
			System.out.println("ERROR WHILE DELETING");
		}
	}

}
