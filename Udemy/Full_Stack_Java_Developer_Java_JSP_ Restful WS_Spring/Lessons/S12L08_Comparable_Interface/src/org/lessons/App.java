package org.lessons;

//The comparable interface ovrrides the compareTo method 
class Data<T extends Comparable<T>> implements Comparable<T> {
	private T myVariable;

	public Data(T myVariable) {
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}

//	if we want to use natural ordering, we have to apply some bounded type
	@Override
	public int compareTo(T o) { 
//		return getMyVariable().compareTo(o);
//		reverse
		return o.compareTo(getMyVariable());
	}

}

public class App {

	public static void main(String[] args) {
		Data<Integer> data = new Data<Integer>(1);
		System.out.println(data.compareTo(2));
	}

}
