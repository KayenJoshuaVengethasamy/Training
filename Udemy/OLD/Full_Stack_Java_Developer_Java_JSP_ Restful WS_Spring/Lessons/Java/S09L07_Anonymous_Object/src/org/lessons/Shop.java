package org.lessons;

import org.lessons.shop.Door;

public class Shop {

	public static void main(String[] args) {
		
		
		
//		Door door = new Door();
		
		
//		this is a nameless object and accessing our method
		if(new Door().isLocked(args[0])) {
			System.out.println("Shop has clased, visit later");
		}else {
			System.out.println("Welcome, we are open");
		}
		System.out.println(args[1]);
		System.out.println(args[2]);

	}

}
