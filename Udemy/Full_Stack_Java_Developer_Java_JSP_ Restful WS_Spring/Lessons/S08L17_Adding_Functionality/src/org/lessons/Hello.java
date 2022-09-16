package org.lessons;

import org.lessons.laptop.Laptop;
import org.lessons.laptop.components.GraphicsCard;
import org.lessons.laptop.components.Processor;

public class Hello {
	public static void main(String[] args) {
		Processor processor = new Processor("Intel", "7200U", 7, 4, 4, "6MB" + "", "2.5Ghz", "2.5Ghz", "3.1Ghz");
		GraphicsCard graphicsCard = new GraphicsCard("Nvidia", 1050, "4GB");
		Laptop gamingLaptop = new Laptop(17f, processor, "DDR4", "2TB", graphicsCard, null, "backlit");
		System.out.println(gamingLaptop);
		gamingLaptop.gamingMode();
		System.out.println("GAMING MODE ON!!!");
		System.out.println("Current Frequency : "+gamingLaptop.getProcessor().getFrequency());
//		Laptop gamingLaptop = new Laptop(17f,
//				new Processor("Intel", "7200U", 7, 4, 4, "6MB" + "", "2.5Ghz", "2.5Ghz", "3.1Ghz"), "DDR4", "2TB",
//				new GraphicsCard("Nvidia", 1050, "4GB"), null, "backlit");
	}

}
