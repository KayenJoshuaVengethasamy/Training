package week1.day3.excercises.task2;

public class instaImpl {
    public static void main(String[] args) {
        //my solution is the exact same for both classes
        System.out.println("My solution");
        instaClass impl = new instaClass();
        impl.depth = 1;
        impl.height = 2;
        impl.weight = 3;
        System.out.println("Depth"+impl.depth);
        System.out.println("Height" +impl.height);
        System.out.println("Weight" + impl.weight);
    }
}
