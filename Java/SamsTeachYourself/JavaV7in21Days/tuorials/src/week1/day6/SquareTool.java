package week1.day6;

public class SquareTool {

    public SquareTool(String input){
        try{
            float in = Float.parseFloat(input);
            Square sq = new Square(in);
            float result = sq.value;
            System.out.println("The square root of " + input + " is " + result);
        }catch (NumberFormatException nfe){
            System.out.println(input + " is not a valid number");
        }
    }
    class Square{
        float value;

        Square (float x){
            value = x*x;
        }
    }

    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Usage : Java SquareTool number");
        }else {
            SquareTool dr = new SquareTool(args[0]);
        }
    }
}
