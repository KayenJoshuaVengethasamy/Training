
public class Hello {

	public static void main(String[] args) {
		/*
//		when dividing, all decimal and floating values will be truncated with int
		int value1 = 9/2;
//		There are two types for decimal or floating numbers : float and double
//		The float data type can store whole numbers as well as decimals. The difference is that int only stores
//		whole numbers, whereas float can handle digits after a decimal point
//		Similar to long data type, we have to explicitly state to java what kind of value will be stored in this variable:
//		'f' for float and 'd' is double
//		Difference between float and double:
//		float is a floating point number and double is a floating point number with double precision
//		float occupies 32-bit space in memory, similar to int
//		double occupies 64-bit
//		double is always preferred because it is more precise and will work faster, similar to int
//		float and double will always show the decimals
//		note the precision of these values
		float value2 = 10f/6f;
		double value3 = 10d/6d;
//		concatenation operator '+' is an overloader operator which can concatenate a string  and can also add two entities
		System.out.println("value 1 = "+value1);
		System.out.println("value 2 = "+value2);
		System.out.println("value 3 = "+value3);
*/
//		a simple example
		int marker = 512;
		double percentage = marker * 0.46f;
		System.out.println("percentage : " + percentage);
	}

}
