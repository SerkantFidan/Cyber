package day09;

import java.util.Scanner;

public class CitizenTypeChecker {
    public static void main(String[] args) {
        String citizenType;
        int age = 80 ;
        if(age > 65) {
            citizenType = "Senior" ;
        }else {
            citizenType = "Not-senior" ;
        }

        System.out.println("The citizen age is " + age + ", and he is a " + citizenType);

        // what can you do inside each part of if statement inside curly braces
    }
}
