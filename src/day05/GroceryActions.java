package day05;

import java.util.Scanner;

public class GroceryActions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What's the price of tomato and store it?");
        System.out.println("What's the price of potato and store it?");
        System.out.println("What's the price of banana and store it?");

        double tomatoPrice = input.nextDouble();
        double potatoPrice = input.nextDouble();
        double bananaPrice = input.nextDouble();

        System.out.println("How many tomato you want to buy and store it");
        System.out.println("How many potato you want to buy and store it");
        System.out.println("How many banana you want to buy and store it");

        double amountOfTomato = input.nextDouble();
        double amountOfPotato = input.nextDouble();
        double amountOfBanana = input.nextDouble();


        double totalTomatoPrice = amountOfTomato * tomatoPrice;
        double totalPotatoPrice = amountOfPotato * potatoPrice;
        double totalBananaPrice = amountOfBanana * bananaPrice;

        System.out.println("You got " + amountOfTomato + " tomato price is $" + tomatoPrice + " and total $" + totalTomatoPrice);
        System.out.println("You got " + amountOfPotato + " potato price is $" + potatoPrice + " and total $" + totalPotatoPrice);
        System.out.println("You got " + amountOfBanana + " banana price is $" + bananaPrice + " and total $" + totalBananaPrice);

        double grandTotal = totalTomatoPrice + totalPotatoPrice + totalBananaPrice;

        System.out.println("Your grand total: $" + grandTotal );


    }
}
