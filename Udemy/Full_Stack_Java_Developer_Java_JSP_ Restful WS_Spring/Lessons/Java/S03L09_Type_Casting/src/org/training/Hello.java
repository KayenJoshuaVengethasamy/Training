package org.training;

public class Hello {

	public static void main(String[] args) {
//		typecasting is conversion from one  data to another
//		this is called implicit type casting, where typecasting is done automatically
//		there will be no issue from short to int, but conversely will be an issue because of type mismatch
//		the implicit type cast is not possible
//		check notes
		short x = 5;
		int y = 10;
		System.out.println(y);
//		this will work
		int a = 10;
//		implicit casting
		short b = (short)a;
		System.out.println(b);
		int c = 10;
		short d = (byte)c;
		System.out.println(d);
		float e = 10.0f;
		double f = e;
		System.out.println(f);
//		lost of precision due to java trunking it
//		implicit casting is done by java where is no ambiquity and the user needs to state it
		double g = 20.0123456789d;
		float h = (float)g;
		System.out.println(h);
		int i = 65000;
		short j = (short)i;
		System.out.println(j);
//		String to int will not work
		float k = 10.0f;
		int l = (int)k;
		System.out.println(l);
		int m = 10;
		float n = m;
		System.out.println(n);
		long o = 10l;
		float p = o;
		System.out.println(p);
		long q = 10l;
		float r = q;
		System.out.println(r);
//		lost of precision
		float s =10.0f;
		long t = (long)s;
		System.out.println(t);

	}

}
