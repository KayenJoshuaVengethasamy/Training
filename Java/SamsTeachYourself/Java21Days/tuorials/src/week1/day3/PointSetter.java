package week1.day3;
import  java.awt.Point;

public class PointSetter {
    public static void main(String[] args) {
        Point location = new Point(4,3);
        System.out.println("Starting location : ");
        System.out.println("X equals : " + location.x);
        System.out.println("Y equals: " + location.y);

        System.out.println("\n Moving to (7,6)");
        location.x = 7;
        location.y = 6;
        System.out.println("\nEnding location : ");
        System.out.println("X equals : " + location.x);
        System.out.println("Y equals: " + location.y);




    }
}
