package org.lessons;

public class Smartphone {
	private String brand = "Samsung";

//	This is a default constructor
//	This is what is automatically injected by Java
//	We can manually code this and add arguments etc
//	public Smartphone() {
//		
//	}

//	this is a constructor with arguments that will throw an error if you call it with no arguments
//	This is because Java follows a simple rule : either I do it or you do it.
//	If you create a constructor, then java will not inject a default construcor
	
//	public Smartphone(String brand) {
//		super();
//		this.brand = brand;
//	}

	public String getBrand() {
		return brand;
	}

}
