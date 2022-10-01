package org.lessons;

import org.lessons.blog.Java;

public class App {

	public static void main(String[] args) {
//		where there is no ambiquity, use the import statement
		Java blog = new Java();
		blog.usedFor();
//		how to make use of classes with same name but different packages
		org.lessons.platforms.Java platform = new org.lessons.platforms.Java();
		platform.usedFor();

	}

}
