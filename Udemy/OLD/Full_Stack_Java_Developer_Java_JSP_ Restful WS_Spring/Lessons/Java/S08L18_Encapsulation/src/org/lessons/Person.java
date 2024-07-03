package org.lessons;

public class Person {
	private String name;
	private int age;
	private String gender;

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean setAge(int age) {
		if (age >= 0 && age <= 100) {
			this.age = age;
			return true;
		}
		return false;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
