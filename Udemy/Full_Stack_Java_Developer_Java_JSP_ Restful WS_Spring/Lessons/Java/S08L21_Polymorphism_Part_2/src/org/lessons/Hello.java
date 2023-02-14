package org.lessons;

import org.lessons.phone.Nokia;
import org.lessons.phone.Phone;
import org.lessons.phone.Samsung;

public class Hello {

	public static void main(String[] args) {
		
		Phone nokia3310 = new Hello().phone(1);
		System.out.println(nokia3310.getModel());
		nokia3310.features();

		Phone note8 = new Hello().phone(2);
		System.out.println(note8.getModel());
		note8.features();

	}

	public Phone phone(int dailyDriver) {
		switch (dailyDriver) {
		case 1:
			return new Nokia("Nokia 3310");
		case 2:
			return new Samsung("Note 5");
		}
		return null;
	}

}
