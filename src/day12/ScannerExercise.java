package day12;

import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        String myName = "Esra";
        Boolean nameCheck = name.equals("Esra");
        System.out.println(nameCheck);
        Boolean nameCheck2 = name.equalsIgnoreCase("ESra");
        System.out.println(nameCheck2);

    }
}
