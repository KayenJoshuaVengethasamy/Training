package org.lessons;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		{
//			file class is used to make directory. Majority of the time, folders are created relative to the project. It is best to use relative path
			File file = new File("Writing_Into_Files");
			file.mkdir();
			file = new File("Writing_Into_Files\\team.txt");
//			try {
//				file.createNewFile();
//				System.out.println("File created");
//			} catch (IOException e) {
//				System.out.println("Error occured while crerating the file");
//			}
//			to write content into the file, we use bufferedWritter
//			if the file does not exist in the FileWriter constructor, it will be created for us

//			this will append the data. Note the true flag in the FileWriter constructor
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
				bw.write("Cantona");
				bw.newLine();
				bw.write("Rooney");
				bw.newLine();
				bw.write("Charlton");
				bw.newLine();
				bw.write("Law");
				bw.newLine();
				bw.write("Best");
				System.out.println("Writing onto the file completed");
			} catch (IOException e) {
				System.out.println("Error occured while writing to the file");
			}
//			this will overwrite the date. Note the FileWriter constructor
//			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
//				bw.write("Cantona");
//				bw.newLine();
//				bw.write("Rooney");
//				bw.newLine();
//				bw.write("Charlton");
//				bw.newLine();
//				bw.write("Law");
//				bw.newLine();
//				bw.write("Best");
//				System.out.println("Writing onto the file completed");
//			} catch (IOException e) {
//				System.out.println("Error occured while writing to the file");
//			}

		}

	}

}
