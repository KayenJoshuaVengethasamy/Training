package org.lessons;

//when we deal with string, there might be issues when we make use of the + operator or ==
//best way is to use .equals() instead of ==
//use .concat instead of +
public class App {

	public static void main(String[] args) {
		String x = "Study";
		String y = "easy";
//		String z = x + y;
		String z = x.concat(y);
		z = z.replace("easy", "hard");
		System.out.println(z);
		if (z == "Studyeasy") {
			System.out.println("Text is Studyeasy");
		} else {
			System.out.println("Text is not Studyeasy");
		}
		if (z.equals("Studyeasy")) {
			System.out.println("Text is Studyeasy");
		} else {
			System.out.println("Text is not Studyeasy");
		}

	}

}
