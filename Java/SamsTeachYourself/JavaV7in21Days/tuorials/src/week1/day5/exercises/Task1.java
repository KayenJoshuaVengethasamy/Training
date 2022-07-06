package week1.day5.exercises;

public class Task1 {
        String status;
        int speed;
        float temperature;

        Task1(String status, int speed, float temperature) {
            this.status = status;
            this.speed = speed;
            this.temperature = temperature;
        }
        void checkTemperature(){
            if (temperature > 600){
                status = "returning home";
                speed = 5;
            }
        }

        void showAttributes(){
            System.out.println("Status : "+ status);
            System.out.println("Speed : "+ speed);
            System.out.println("Temperature : "+ temperature);
        }
    }


