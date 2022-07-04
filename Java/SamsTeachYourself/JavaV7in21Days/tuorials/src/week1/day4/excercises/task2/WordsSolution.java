package week1.day4.excercises.task2;

public class WordsSolution {
    public static void main(String[] arguments) {
    if (arguments.length > 0) {
        long num = 0;
        char firstChar = arguments[0].charAt(0);
        char secondChar = arguments[0].charAt(1);
        switch (firstChar) {
            case 'o':
                num = 1L;
                break;
            case 't':
                if (secondChar == 'w')
                    num = 2L;
                if (secondChar == 'h')
                    num = 3L;
                if (secondChar == 'e')
                    num = 10L;
                break;
            case 'f':
                if (secondChar == 'o')
                    num = 4L;
                if (secondChar == 'i')
                    num = 5L;
                break;
            case 's':
                if (secondChar == 'i')
                    num = 6L;
                if (secondChar == 'e')
                    num = 7L;
                break;
            case 'e':
                if (secondChar == 'i')
                    num = 8L;
                break;
            case 'n':
                num = 9L;
        }
        System.out.println("The number is " + num);
    }
}
}

