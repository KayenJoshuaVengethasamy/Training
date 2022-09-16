package animal.fish;

public class Eel extends Fish {
//	private because it is not a parent to any other class
//	If we are talking about a specific entity, private access modifier is the best
	private String special;

	public Eel() {
		super();
		this.special = "releases electric stock";
	}

	public String showInfo() {
		return "Eel [special=" + special + ", waterBone=" + waterBone + ", gills=" + gills + ", heightInFeet="
				+ heightInFeet + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}

}
