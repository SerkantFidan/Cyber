package day06;

import java.util.Scanner;

public class MinutetoToHourConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the minutes you want to convert");
        int minutes = scan.nextInt();
        int hourPart = minutes / 60; //--->
        int minsPart = minutes % 60; //--->
        System.out.println("The minutes " + minutes + " is " + hourPart + " hours and "+ minsPart + " minutes" );
    }
}
