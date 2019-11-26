package office_hour;

import java.util.Scanner;

public class replt_35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        //WRITE YOUR CODE HERE
        double price = scan.nextDouble();
        double giftCard = 100;
        double currentBalance = giftCard - price;
        if (price > 100) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (price <= 100) {
        } else if (item == "Smartphone") {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item == "Laptop") {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item == "Charger") {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item == "USB cable") {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item == "Headphones") {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item == "Pants") {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item == "Hat") {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item == "Socks") {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item == "Blanket") {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item == "Pillow") {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else {
            System.out.println("Invalid item!");
        }


    }

}


