package week1.day6.exercises.task1.za.co.ecommerce;

public class GiftShop {
    public static void main(String[] args) {
        Storefront store = new Storefront();
        store.addItem("C01", "MUG", "9.99", "150", true);
        store.addItem("C02", "LG MUG", "12.99", "82", false);
        store.addItem("C03", "MOUSEPAD", "10.49", "800", false);
        store.addItem("D01", "T SHIRT", "16.99", "90", true);
        store.sort();
        for(int i = 0; i< store.getSize(); i++){
            Item show = (Item)store.getItem(i);
            System.out.println(
                    "\nItem ID : " + show.getId() +
                    "\nName : " + show.getName() +
                    "\nRetail : " + show.getRetail() +
                    "\nPrice : " + show.getPrice() +
                            "\nQuantity : " + show.getQuantity() +
                            "\nQuantity : " + show.isNoDiscount()
            );
        }

    }
}
