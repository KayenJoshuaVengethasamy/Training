//carried over from S05L02
//everything is case sensitive
package org.lessons;

public class Hello {
	public static void main(String[] args) {
		String name = "TeAm";

		switch (name.toLowerCase()) {	
		case "author":
			System.out.println("The author is Kayen");
			break;	
		case "team":
			System.out.println("The team is Man Utd");
			break;	
		case "editor":
			System.out.println("My editor is Eclipse IDE");
			break;
		default:
			System.out.println("INVALID ENTRY!!!");
			break;
		}

	}

}
