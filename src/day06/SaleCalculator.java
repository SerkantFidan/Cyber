package day06;

import java.util.Scanner;

public class SaleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double regularPrice, salePrice, discountPercentage;
        //double regularPrice;
        //double salePrice;
        //double discountPercentage;
        //if you have variables with same data type, you can declare them in one line like this

        System.out.println("What is the regular price? :");
        regularPrice = scan.nextDouble();

        System.out.println("How many discount percentage? :");
        discountPercentage = scan.nextDouble();

        salePrice =regularPrice - regularPrice * discountPercentage;

        System.out.println("Regular price is " + regularPrice + "$," + " discount is " + discountPercentage + " and your got deal for " + salePrice +"$");


    }
}
