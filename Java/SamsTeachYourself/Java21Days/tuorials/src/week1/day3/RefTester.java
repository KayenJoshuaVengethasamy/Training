package week1.day3;
import java.awt.Point;
public class RefTester {
    public static void main(String[] args) {
        Point pt1,pt2;
        pt1 = new Point(100,100);
        pt2 = pt1;
        pt1.x=200;
        pt1.y = 200;
        System.out.println("Point 1 : " + pt1.x + ", " + pt1.y);
        System.out.println("Point 2 :" +  pt2.x+ ", " + pt2.y);

    }
}
