package week2.day8.exercises;

import java.util.HashMap;

public class Task1 {

    public Task1() {
    }

    public static void main(String[] args) {
//        set up hash map
        HashMap quality = new HashMap();
        float price1 = 5.00F;
        quality.put("Pristine Mint", price1);
        float price2 = 3.00F;
        quality.put("Mint", price2);
        float price3 = 2.00F;
        quality.put("Near Mint", price3);
        float price4 = 1.5F;
        quality.put("Very Fine", price4);
        float price5 = 1.00F;
        quality.put("Fine", price5);
        float price6 = 0.5F;
        quality.put("Good", price6);
        float price7 = 0.25F;
        quality.put("Poor", price7);
        float price8 = 0.10F;
        quality.put("Coverless", price1);
//        set up collection
        Task[] comix = new Task[5];
        comix[0] = new Task("Amazing Spider-Man", "1A", "Very Fine", 5_000.00F);
        comix[0].setPrice((Float) quality.get(comix[0].condition));
        comix[1] = new Task("The Incredible Hulk", "181", "Near Mint", 240.00F);
        comix[1].setPrice((Float) quality.get(comix[1].condition));
        comix[2] = new Task("Cerebus", "1A", "Good", 144.00F);
        comix[2].setPrice((Float) quality.get(comix[2].condition));
        comix[3] = new Task("Iron Man", "2008", "Pristine Mint", 6_000.00F);
        comix[3].setPrice((Float) quality.get(comix[3].condition));
        comix[4] = new Task("Black Panther", "W4E", "Coverless", 8_000.00F);
        comix[4].setPrice((Float) quality.get(comix[4].condition));
        for (int i = 0; i < comix.length; i++) {
            System.out.println("Title : " + comix[i].title);
            System.out.println("Issue : " + comix[i].issueNumber);
            System.out.println("Condition : " + comix[i].condition);
            System.out.println("Price : $" + comix[i].price + "\n");
        }
    }
}

class Task {
    String title;
    String issueNumber;
    String condition;
    float basePrice;
    float price;

    Task(String inTitle, String inIssueNumber, String inCondition, float inBasePrice) {
        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }

    void setPrice(float factor) {
        price = basePrice * factor;
    }
}

