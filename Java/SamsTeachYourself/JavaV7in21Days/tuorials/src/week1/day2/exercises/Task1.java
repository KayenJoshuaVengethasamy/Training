package week1.day2.exercises;

public class Task1 {
    public static void main(String[] args) {
//        my attempt
        long investment = 14_000;
        long investmentAfter1Year = ((14/100)*investment)+investment;
        long investmentAfter2Years = (investmentAfter1Year)-1_500;
        long investmentAfter3Years = ((12/100)*investmentAfter2Years)+investmentAfter2Years;
        System.out.println("Initial investment : " + investment);
        System.out.println("Investment after a year : " + investmentAfter1Year);
        System.out.println("Investment after 2 years : " + investmentAfter2Years);
        System.out.println("Investment after 3 years : " + investmentAfter3Years);

//        solution
        float total = 14000;
        System.out.println("Original investment: $" + total);
        // Inceases by 40 percent the first year
        total = total + (total * .4F);
        System.out.println("After one year: $" + total);
        // Loses $1,500 the second year
        total = total - 1500F;
        System.out.println("After two years: $" + total);
        // Increases by 12 percent the third year
        total = total + (total * .12F);
        System.out.println("After three years: $" + total);
    }

}
