package week1.day5;

public class Printer {
    int x = 0;
    int y=1;

    void printMe(){
        System.out.println("x is " + x + " , y is " + y);
        System.out.println("I am an instance of the class " + this.getClass().getName());
    }
}

class SubPrinter extends Printer{
    int z = 3;

    public static void main(String[] args) {
        SubPrinter obj = new SubPrinter();
        obj.printMe();
    }
    void printMe(){
        System.out.println("x is " + x + " , y is " + y + " , z is " + z);
        System.out.println("I am an instance of the class " + this.getClass().getName());
    }
}