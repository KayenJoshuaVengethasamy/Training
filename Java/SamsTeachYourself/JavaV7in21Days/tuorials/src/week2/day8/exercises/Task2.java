package week2.day8.exercises;

import java.util.*;

public class Task2 {

    public Task2(){}

    public static void main(String[] args) {
        HashMap cart = new HashMap();
        float price1 = 14.00F;
        float price2 = 24.00F;
        float price3 = 34.00F;
        float price4 = 44.00F;
        float price5 = 54.00F;

        cart.put("Apple", price1);
        cart.put("Mango", price2);
        cart.put("Pear", price3);
        cart.put("Orange", price4);
        cart.put("Banana", price5);

        Fruit[] fruit = new Fruit[5];
        fruit[0] = new Fruit("Apple", 18, 14.00F);
        fruit[1] = new Fruit("Mango", 28, 24.00F);
        fruit[2] = new Fruit("Pear", 38, 34.00F);
        fruit[3] = new Fruit("Orange", 48, 44.00F);
        fruit[4] = new Fruit("Banana", 58, 54.00F);
        for (int i = 0; i < fruit.length; i++) {
            System.out.println("Name : " + fruit[i].name);
            System.out.println("Quantity : " + fruit[i].quantity);
            System.out.println("Price : $" + fruit[i].price);
        }



    }
}

class Fruit {
    String name;
    int quantity;
    float price;

    Fruit(String inName, int inQuantity, float inPrice) {
        name = inName;
        quantity = inQuantity;
        price = inPrice;
    }

}
