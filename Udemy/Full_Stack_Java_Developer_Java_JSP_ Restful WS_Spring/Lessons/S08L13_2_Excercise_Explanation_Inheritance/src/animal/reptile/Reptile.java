package animal.reptile;

import animal.Animal;

public class Reptile extends Animal {
	protected String skin, egg;
	protected boolean backbone;

	public Reptile() {
		heightInFeet = 5;
		weightInKilos = 20;
		animalType = "Reptile";
		bloodType = "Cold";
		this.skin = "dry skin";
		this.backbone = true;
		this.egg = "soft shelled";
	}

	public String showInfo() {
		return "Reptile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

}
