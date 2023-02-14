package org.lessons;

public class Hello {

	public static void main(String[] args) {
//		This is a call to a constructor. Even though there is no constructor that we have created
//		This is because when there is no constructor stated, java will inject a default constructor for us 
//		A default constructor is a constructor with no statement
		Smartphone phone = new Smartphone();
		System.out.println(phone.getBrand());

	}

}
