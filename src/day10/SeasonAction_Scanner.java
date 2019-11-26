package day10;

import java.util.Scanner;

public class SeasonAction_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey what is the season!!!?");
        String season = scan.next();
        switch(season){
            case "Spring":
                System.out.println("Hike! Easter , Nawruz, Blossom");
                break;
            case "Summer":
                System.out.println("Swim , Vacation , BBQ, Holiday");
                break;
            case "Fall":
                System.out.println("Black Friday, Hiking, Harvest, Halloween, Shopping");
                break;
            case "Winter":
                System.out.println("Snowboarding , Ski, Christmas, New Year");
                break; // Default part of switch is optional, the break is also option for default par, because after default the switch statement finish

        }









    }
}
