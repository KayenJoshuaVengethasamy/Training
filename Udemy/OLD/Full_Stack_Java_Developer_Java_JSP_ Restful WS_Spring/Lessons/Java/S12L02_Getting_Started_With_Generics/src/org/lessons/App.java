package org.lessons;

//Object is the parent of everything
class Data {
	private Object obj;

	public Data(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}

}

// T/t represents type
//T/t is used when we dont know the type but it can be anything
class GenericClass<T> {
	private T data;

	public GenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}

}

public class App {

	public static void main(String[] args) {

//		Data data = new Data("Some String");
//		we need to typecast in order to use an object
//		String variable = (String) data.getObj();
//		System.out.println(variable);
//		Whenever we cast, the performance of the application goes down as typecasting requires some time for processing. 
//		So we try to avoid using it. We will take care of this by stating the type of data that will be stored
//		we are specifying the information that will be stored in this object which removes the need of typecasting as well as typesafety is ensured
		GenericClass<String> genericData = new GenericClass<String>("Some Data");
		String data = genericData.getData();
		System.out.println(data);

	}

}
