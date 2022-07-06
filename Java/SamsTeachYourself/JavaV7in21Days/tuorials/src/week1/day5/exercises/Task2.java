//solution is same as mine
package week1.day5.exercises;

import java.awt.*;

public class Task2 extends Point {
    int w =0;
    int z=0;

    Task2(int w,int x, int y, int z){
        super(x,y);
        this.w = w;
        this.z = z;
    }

    public static void main(String[] args) {
        Task2  fourDPoint = new Task2(1,2,3,4);
        System.out.println("Point w is : " + fourDPoint.w);
        System.out.println("Point x is : " + fourDPoint.x);
        System.out.println("Point y is : " + fourDPoint.y);
        System.out.println("Point z is : " + fourDPoint.z);
    }

}
