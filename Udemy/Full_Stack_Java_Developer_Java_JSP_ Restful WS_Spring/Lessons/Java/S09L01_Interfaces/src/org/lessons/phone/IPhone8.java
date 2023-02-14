package org.lessons.phone;

public class IPhone8 implements Phone {
//
	@Override
	public String processor() {
		return "A11";
	}

	@Override
	public String OS() {

		return "IOS";
	}

	@Override
	public int spaceInGB() {
		return 64;
	}

}
