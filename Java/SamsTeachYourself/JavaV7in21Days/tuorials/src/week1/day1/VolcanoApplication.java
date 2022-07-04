package week1.day1;

public class VolcanoApplication {
    public static void main(String [] arguments){
        VolcanoRobot dante = new VolcanoRobot();
        dante.status = "exploring";
        dante.speed = 2;
        dante.temperature = 510;
        dante.showAttributes();
        System.out.println("Increasing speed to 3");
        dante.speed = 3;
        dante.showAttributes();
        System.out.println("Changing temperature to 670");
        dante.temperature = 670;
        dante.showAttributes();
        System.out.println("Checking the temperature");
        dante.checkTemperature();
        dante.showAttributes();
//Excercise
//        my answer
        VolcanoRobot virgil = new VolcanoRobot();
        virgil.status = "Exploring";
        virgil.speed = 2;
        virgil.temperature = 371;
        virgil.showAttributes();
        System.out.println("Increasing speed to 3");
        virgil.speed = 3;
        virgil.showAttributes();
        System.out.println("Changing temperature to 700");
        virgil.temperature = 700;
        virgil.showAttributes();
        System.out.println("Checking the temperature");
        virgil.checkTemperature();
        virgil.showAttributes();
//        solution
        VolcanoRobot virgils = new VolcanoRobot();
        System.out.println("\nVirgil:");
        virgils.status = "exploring";
        virgils.speed = 4;
        virgils.temperature = 535;
        virgils.showAttributes();
    }
    }

