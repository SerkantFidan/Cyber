package day09;

import java.util.Scanner;

public class DayPrinter_Version2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int dayCode = scan.nextInt();
        String dayName = ""; // assigning a empty String value
        if(dayCode == 1){
            System.out.println("Day is Monday");
        } else if(dayCode == 2) {
            System.out.println("Day is Tuesday");
        } else if(dayCode == 3) {
            System.out.println("Day is Wednesday");
        } else if(dayCode == 4) {
            System.out.println("Day is Thursday");
        } else if(dayCode == 5) {
            System.out.println("Day is Friday");
        } else if(dayCode == 6) {
            System.out.println("Day is Saturday");
        } else if(dayCode == 7) {
            System.out.println("Day is Sunday");
        }else {
            System.out.println("Day is Unknown");
        }




    }
}
