package week1.day5.exercises.Task1Solution;

class VolcanoRobot5 {
    String status;
    int speed;
    float temperature;

    VolcanoRobot5(String inStatus, int inSpeed, float inTemperature) {
        status = inStatus;
        speed = inSpeed;
        temperature = inTemperature;
    }

    void checkTemperature() {
        if (temperature > 660) {
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }

    public static void main(String[] arguments) {
        VolcanoRobot5 dante = new VolcanoRobot5("exploring", 2, 510);

        dante.showAttributes();
        System.out.println("Increasing speed to 3.");
        dante.speed = 3;
        dante.showAttributes();
        System.out.println("Changing temperature to 670.");
        dante.temperature = 670;
        dante.showAttributes();
        System.out.println("Checking the temperature.");
        dante.checkTemperature();
        dante.showAttributes();
    }
}