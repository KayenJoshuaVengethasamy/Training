package org.lessons;
//if you mark a class as final, essentially everything becomes final and cannot be overriden or extended
public final class A {
//	if we have a final method, it cannot be overriden
	public final void india() {
		System.out.println("India is amazing!");
	}

	public void USA() {
		System.out.println("USA is fantastic");
	}

}
