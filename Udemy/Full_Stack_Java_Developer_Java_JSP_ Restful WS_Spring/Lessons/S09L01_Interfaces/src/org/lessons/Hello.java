package org.lessons;

import org.lessons.phone.IPhone8;
import org.lessons.phone.OnePlus5;
import org.lessons.phone.Phone;

public class Hello {

	public static void main(String[] args) {
		Phone phone = new OnePlus5();
		System.out.println("Processor : "+phone.processor());
		System.out.println("Space in GB : "+phone.spaceInGB());

	}

}
