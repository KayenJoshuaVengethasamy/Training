package week1.day4;

public class HalfDollars {
    public static void main(String[] args) {
        int[] denver = {1_900_000, 1_700_000, 1_700_000};
        int [] philadelphia = new int [denver.length];
        int[] total = new int [denver.length];
        int average;

        philadelphia[0] = 1_900_000;
        philadelphia[1]= 1_800_000;
        philadelphia[2] = 1_750_000;

        total[0] = denver[0]+ philadelphia[0];
        total[1] = denver[1]+ philadelphia[1];
        total[2] = denver[2]+ philadelphia[2];

        average = (total[0] + total[1]+total[2]) / 3;

        System.out.println("2009 production : ");
        System.out.format("%,d%n", total[0]);
        System.out.println("2010 production : ");
        System.out.format("%,d%n", total[1]);
        System.out.println("2011 production : ");
        System.out.format("%,d%n", total[2]);
        System.out.println("Average production : ");
        System.out.format("%,d%n", average);
    }

}
