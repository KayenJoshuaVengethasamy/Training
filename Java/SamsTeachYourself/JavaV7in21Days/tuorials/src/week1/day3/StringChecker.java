package week1.day3;

import java.util.Locale;

public class StringChecker {
    public static void main(String[] args) {
        String str = "Would you like an apple pie with that?";
        System.out.println("The string is : " + str);
        System.out.println("Length of the string : " + str.length());
        System.out.println("The character at position 6 : " + str.charAt(6));
        System.out.println("the substring string from 26 to 32 : " + str.substring(26,32));
        System.out.println("The index of the first 'a' : " + str.indexOf('a'));
        System.out.println("the index of the beginning of the substring apple : " + str.indexOf("apple"));
        System.out.println("The string in uppercase : " + str.toUpperCase());

    }
}
