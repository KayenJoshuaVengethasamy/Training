package org.lessons;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		{
//			create a directory by adding arguments to the new file declaration
//			if you want to make a subdirectory, use either / or \\
			File directory = new File("Creating_A_Directory_In_Java\\author\\Kayen");
//			no exceptions are thrown because whenever we are handling the file operations, then it is mandatory to handle exceptions. 
//			Making a directory will not cause exceptions 
//			this will only create one directory
//			directory.mkdir();
//			this will create subdirectories
			directory.mkdirs();
			System.out.println("Directory created");
//			create a file within a certain directory
//			add the file extension if you do not want to create a directory2
//			the example below creates a file using the complete path relative to the project
			File file = new File("Creating_A_Directory_In_Java\\author\\Kayen\\test.txt");
			file.createNewFile();
			System.out.println("FILE CREATED");
		}

	}

}
