package org.lessons;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.bird.Eagle;
import animal.fish.Eel;
import animal.reptile.Crocodile;
import animal.reptile.Reptile;

public class Main {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();

		Animal animal = new Animal();

		Reptile reptile = new Reptile();
//		Sub class reference inside super class object
		Animal crocodile = new Crocodile();

		Animal eel = new Eel();

		Animal eagle = new Eagle();

		animals.add(animal);
		animals.add(reptile);
		animals.add(crocodile);
		animals.add(eel);
		animals.add(eagle);
		listAnimals(animals);
	}

	public static void listAnimals(List<Animal> animals) {
//		for loop over object
		for (Animal animal : animals) {
			System.out.println(animal.showInfo());
		}
	}
}
