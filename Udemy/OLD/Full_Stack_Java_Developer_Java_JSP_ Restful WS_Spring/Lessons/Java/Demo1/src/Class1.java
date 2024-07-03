import java.math.BigDecimal;

public class Class1 {
	public static void main (String args[]) {
//		There is a lack of precision here
		double x = 1.05;
		double y = 2.55;
		System.out.println(x+y);
//		To resolve this, we will use BigDecimal, which will give you tools to help to calculate decimals with bigger precision
		BigDecimal d1 = new BigDecimal(1.05);
		BigDecimal d2 = new BigDecimal(2.55);
//		This will make it worse
		System.out.println(d1.add(d2));
//		To resolve, use a string version of the variables/values
//		Rounding up will be disabled using this method by default and get a proper result
		BigDecimal d3 = new BigDecimal("1.05");
		BigDecimal d4 = new BigDecimal("2.55");
		System.out.println(d3.add(d4));
	}

}
