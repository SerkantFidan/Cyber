package day04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name please :");

        String firstName = scanner.next();

        System.out.println("How old are you?");

        int age = scanner.nextInt();

        System.out.println("Your name is: " + firstName + "\n" + "Your age is: "+ age);






    }
}
