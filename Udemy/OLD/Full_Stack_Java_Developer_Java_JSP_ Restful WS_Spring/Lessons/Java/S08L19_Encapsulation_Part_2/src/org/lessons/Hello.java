package org.lessons;

public class Hello {

	public static void main(String[] args) {
		Person john = new Person();
		System.out.println(john);
		Person leah = new Person("Leah", 16, "Female");
		System.out.println(leah);
		leah.setAge(-30);
		System.out.println(leah);
	}

}
