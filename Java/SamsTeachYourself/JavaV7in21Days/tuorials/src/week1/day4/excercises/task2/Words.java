package week1.day4.excercises.task2;

public class Words {
    public static void main(String[] args) {
//        my solution
        System.out.print("My solution");
        String words[]= {"one","two","three","four","five","six","seven","eight","nine","ten"};
        for(int i=0; i< words.length; i++) {
            System.out.print(convertToLong(words[i]) + ", ");
        }
    }
    static long convertToLong(String word){
        Long stringToLong = 0L;
        switch(word){
            case "one":
                stringToLong = 1L;
                break;
            case "two":
                stringToLong = 2L;
                break;
            case "three":
                stringToLong = 3L;
                break;
            case "four":
                stringToLong = 4L;
                break;
            case "five":
                stringToLong = 5L;
                break;
            case "six":
                stringToLong = 6L;
                break;
            case "seven":
                stringToLong = 7L;
                break;
            case "eight":
                stringToLong = 8L;
                break;
            case "nine":
                stringToLong = 9L;
                break;
            case "ten":
                stringToLong = 10L;
                break;

        }
        return stringToLong;
    }
}
