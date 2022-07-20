package week1.day7.exercises;


public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2(args);
    }

    public Task2(String[] args){
        Task1[] finder = new Task1[args.length];
        for (int i = 0; i < args.length ; i++) {
            try{
                long count = Long.parseLong(args[i]);
                finder[i] = new Task1(count);
                System.out.println("Looking for prime " + count);
            }catch (NumberFormatException |Task1.NegativeNumberException e) {
                System.out.println("Error : " + e.getMessage());
            }
        }
        boolean complete = false;
        while(!complete){
            complete = true;
            for (int j = 0; j < finder.length; j++) {
                if(finder[j] == null) continue;
                if (!finder[j].finished) {
                    complete =false;
                }
                else {
                    displayResult(finder[j]);
                    finder[j] = null;
                }
            }
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ie){
//                do nothing
            }
        }
    }

    private void displayResult(Task1 finder){
        System.out.println("Prime " + finder.target + " is " + finder.prime);
    }
}
