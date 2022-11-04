package org.lessons;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		{
			File file = new File("Reading_Files_With_BufferedReader");
			file.mkdir();
			file = new File("Reading_Files_With_BufferedReader\\team.txt");
//			we are using parenthesis here because we want a specific point where the try block will be checking the exception handling
//			the implementation is good
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
//				always close the writer
				bw.close();
			} catch (IOException e) {
				System.out.println("Error occured while writing to the file");
			}
//			to be able to read contents of a file, use bufferedReader
//			we have multiple catch blocks, so it is not recommended to use the parenthesis version of try
			try {
				BufferedReader br = new BufferedReader(new FileReader("Reading_Files_With_BufferedReader\\team.txt"));
//				we have the handle above, and using it we can read information and in order to read the information, we need to traverse the file itself
//				we will use while loop for this
//				the information the readline will read will be returned in the form of a string
				String line;
				System.out.println("******************");
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
				br.close();
			} catch (FileNotFoundException e) {
				System.out.println("FileNotFoundException");
			} catch (IOException e) {
				System.out.println("IOException");
			}

		}
	}
}
