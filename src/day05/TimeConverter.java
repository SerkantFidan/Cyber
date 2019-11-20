package day05;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many minutes have in that day?");

        int day = input.nextInt();

        int minuteADay = day*24*60;

        System.out.println("in that day has " + minuteADay + " minutes");


    }
}
