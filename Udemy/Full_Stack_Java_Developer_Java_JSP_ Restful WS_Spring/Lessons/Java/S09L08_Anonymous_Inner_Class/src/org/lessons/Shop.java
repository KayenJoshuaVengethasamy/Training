package org.lessons;

import org.lessons.shop.Door;

public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		if (door.getLock().isUnlocked(args[0])) {
			System.out.println("Welcome, we are open");
		} else {
			System.out.println("Shop has closed, visit later");
		}
	}

}
