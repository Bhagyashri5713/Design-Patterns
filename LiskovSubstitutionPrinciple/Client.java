package LiskovSubstitutionPrinciple;

import static LiskovSubstitutionPrinciple.BaverageItem.printItemPrice;

public class Client {
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem(100,"Mango","Mango");
        BaverageItem baverageItem = new BaverageItem(60,"Apple","Apple");

        printItemPrice(menuItem);
        printItemPrice(baverageItem);
    }
}
