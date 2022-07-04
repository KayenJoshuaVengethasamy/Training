package week1.day4;

public class HalfLooper {
    public static void main(String[] args) {
        int[] denver = {1_900_000, 1_700_000, 1_700_000};
        int [] philadelphia = {1_900_000, 1_800_000, 1_750_000};
        int[] total = new int [denver.length];
        int sum = 0;

        for (int i=0; i<denver.length; i++){
            total[i] = denver[i]+philadelphia[i];
            System.out.format((i+2009) + " production : %, d%n", total[i]);
            sum += total[i];
        }

        System.out.format("Average production : %,d%n", (sum/denver.length));
    }
}
