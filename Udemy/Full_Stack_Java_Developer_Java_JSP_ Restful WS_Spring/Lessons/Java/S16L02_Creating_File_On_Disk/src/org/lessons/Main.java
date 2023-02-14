package org.lessons;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		{
//			this is half the work
//			to change directories use the folder name followed by the forward slash/
//			this is a relative path and will be stored within the project folders
//			Whenever a file is created, it is created with the reference to the current project. 
//			As a result, if no directory is specified, it will fall into the project folder.
//			if a directory is specified it will follow that directory relatively or exactly if using absolute path
//			paths are not case sensitive
//			File file = new File("Training.txt");
			File file = new File("src/Training.txt");
//			this will work on windows and other os, you can also use double backslash
//			File file = new File("src\\Training.txt");
//			using an absolute path to a folder not in the project
//			File file = new File("C:\\testProjects\\Training.txt");
//			this statement is the other half of the work which will give us a file
//			We need to wrap this in try catch or use throws declaration
			file.createNewFile();
			System.out.println("File created");

		}

	}
}
