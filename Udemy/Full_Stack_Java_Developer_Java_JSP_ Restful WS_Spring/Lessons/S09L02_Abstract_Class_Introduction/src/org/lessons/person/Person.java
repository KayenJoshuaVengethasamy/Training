package org.lessons.person;
//If there is a doubt when to use an abstract class or interface. Look at the relationship.
//what is the relationship between a inherited class? It is an 'is a' relationship
//whenever the relationship between the two classes is this relationship, use abstract class if required. Else use interface
//the relationship between an interface and class is a can relationship
//Functionality that symbolises actions are usually interfaces
public abstract class Person {
	
	public void speak() {
		System.out.println("Shares his/her thoughts");
	}
	
	public abstract void eat();
	
	

}
