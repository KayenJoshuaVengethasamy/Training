
public class Hello {
	public static void main(String[] args) {
//		A string is a sequence of characters. Can also use unicode in the same manner as char
		String var = "Hello World! \u00BB";
		System.out.println(var);

		String var1 = "10";
		String var2 = "20";
//		this will not add, rather concatenate because it is a string
//		it will not work even if we remove the quotes as it is a string data type and not an int

		System.out.println(var1 + var2);
		int var3 = 10;
		String var4 = "20";
//		this will not add, rather concatenate because there is a string value
//		this is because of typecasting, which is interconversion of datatype
		System.out.println(var3 + var4);
//		this will add
		System.out.println(var3 + 20);
//		this will add as well as concatenate
		System.out.println(var3 + 20 + "HELLO");
//		Whenever there are operands and one of them is a string, the other operands will be converted to a string if possible 
//		proper way to declare a string is like this, this is because string is a class
		String proper = new String("Hello World");
		System.out.println(proper);
	}

}
