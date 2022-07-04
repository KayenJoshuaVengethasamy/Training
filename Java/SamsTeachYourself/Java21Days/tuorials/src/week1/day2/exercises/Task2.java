package week1.day2.exercises;

public class Task2 {
    public static void main(String[] args) {
//my answer
        int myNumber1= 37;
        int myNumber2=3;
        System.out.println("First number : " + myNumber1);
        System.out.println("Second number : " + myNumber2);
        System.out.println("When they are divided they produce : " + (myNumber1/myNumber2) + "\twith remainder : " + (myNumber1%myNumber2));
        //solution
        float number1 = 15;
        float number2 = 6;
        float result = number1 / number2;
        float remainder = number1 % number2;
        System.out.println(number1 + " divided by " + number2);
        System.out.println("\nResult\tRemainder");
        System.out.println(result + "\t" + remainder);
    }
    }
