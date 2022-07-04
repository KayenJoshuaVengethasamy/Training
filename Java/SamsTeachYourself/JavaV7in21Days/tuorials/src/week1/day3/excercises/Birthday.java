package week1.day3.excercises;

import java.util.StringTokenizer;

public class Birthday {

    public static void main(String[] args) {
        //my solution
        System.out.println("My solution");
        String bDay = "04/29/2013";
        StringTokenizer token = new StringTokenizer(bDay, "/");
        System.out.println("Token 1 : " + token.nextToken());
        System.out.println("Token 2 : " + token.nextToken());
        System.out.println("Token 3 : " + token.nextToken());
        //their solution
        System.out.print("Their solution");
        String birthday = "08/23/2002";
        String month = birthday.substring(0, 2);
        String day = birthday.substring(3, 5);
        String year = birthday.substring(6, 10);
        System.out.println("Birthday: " + birthday);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Year: " + year);
    }
    }

