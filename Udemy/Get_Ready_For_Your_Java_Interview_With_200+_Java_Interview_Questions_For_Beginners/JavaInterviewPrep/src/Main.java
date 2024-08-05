import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string to reverse");
//        String reverse = scanner.nextLine();
//        System.out.println(Reverse(reverse));
//        scanner.close();
//        System.out.println(addDigits(55));

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println("s1 "+s1.hashCode());
        System.out.println("s2 "+s2.hashCode());
        System.out.println("s3 "+s3.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
    }

    public static String Reverse(String input) {
        StringBuilder out = new StringBuilder();
        if (input == null) {
            throw new IllegalArgumentException("Please enter string to reverse");
        } else {
            char[] characters = input.toCharArray();
            for (int i = characters.length - 1; i >= 0; i--) {
                out.append(characters[i]);
            }
        }
        return out.toString();
    }

    public static int addDigits(int input) {
        int sum = 0;
        if (input < 10) {
            sum = input;
        } else if (input == 10) {
            sum = 1;
        } else {
            while (input != 0) {
                sum = sum + (input % 10);
                input = input / 10;
            }
        }
        return sum;
    }



}