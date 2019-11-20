package day05;

import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {
        //Create scanner object
        //you can name your variable whatever you want
        //in below case we are calling it scan
        //Scanner is data type, scan is the name, new Scanner(System.in) is the value
        Scanner scanner = new Scanner(System.in);  //--> Scanner Object

        System.out.println("What is your name? :");
        //String name = "Esra";
        String name = scanner.next();

        System.out.println("Your name is " + name);

        System.out.println("What is your birth year? :");
        int birthYear = scanner.nextInt();
        int age = 2019 - birthYear;
        System.out.println("Your age is : " + age + " years old.");

        System.out.println("What is your height? : ");
        double height = scanner.nextDouble();
        System.out.println("Your height is " + height);

    }
}
