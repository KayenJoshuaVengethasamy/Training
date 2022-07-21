package week2.day8;
import java.util.*;
public class ComicBooks {

    public ComicBooks(){

    }

    public static void main(String[] args) {
//        set up hash map
        HashMap quality = new HashMap();
        float price1 = 3.00F;
        quality.put("Mint", price1);
        float price2 = 2.00F;
        quality.put("Near Mint", price2);
        float price3 = 1.5F;
        quality.put("Very Fine", price3);
        float price4 = 1.00F;
        quality.put("Fine", price4);
        float price5 = 0.5F;
        quality.put("Good", price5);
        float price6 = 0.25F;
        quality.put("Poor", price6);
//        set up collection
        Comic[] comix = new Comic[3];
        comix[0] = new Comic("Amazing Spider-Man", "1A", "Very Fine", 5_000.00F);
        comix[0].setPrice((Float) quality.get(comix[0].condition));
        comix[1] = new Comic("The Incredible Hulk", "181", "Near Mint", 240.00F);
        comix[1].setPrice((Float) quality.get(comix[1].condition));
        comix[2] = new Comic("Cerebus", "1A", "Good", 144.00F);
        comix[2].setPrice((Float) quality.get(comix[2].condition));
        for (int i = 0; i < comix.length; i++) {
            System.out.println("Title : " + comix[i].title);
            System.out.println("Issue : " + comix[i].issueNumber);
            System.out.println("Condition : " + comix[i].condition);
            System.out.println("Price : $" + comix[i].price + "\n");
        }
    }
}

class Comic{
    String title;
    String issueNumber;
    String condition;
    float basePrice;
    float price;

    Comic(String inTitle, String inIssueNumber, String inCondition, float inBasePrice){
        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }

    void setPrice(float factor){
        price = basePrice * factor;
    }
}
