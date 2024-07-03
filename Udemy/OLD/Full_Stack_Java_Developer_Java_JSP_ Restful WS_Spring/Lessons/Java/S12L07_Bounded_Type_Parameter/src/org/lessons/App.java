package org.lessons;

// classes such as Integer and Character are final classes and will give a warning because the subclasses of these classes will not be able to use key value in this example
// you can ignore this warning if you are 100% certain
class Data<K extends Integer, V extends App> {
	private K key;
	private V value;

	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}

//	bound or restrict a number element to be a number
	public <E extends Character, N extends Number> void display(E element, N number) {
		System.out.println("Element : " + element + " Number : " + number);
	}
}

public class App {

	public static void main(String[] args) {
		Data<Integer, App> data = new Data<Integer, App>(1, new App());
		data.display('$', 1.23);
		data.getValue().test();
		System.out.println(data.getKey());

	}

	public void test() {
		System.out.println("Testing...");
	}

}
