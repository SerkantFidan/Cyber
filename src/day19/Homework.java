package day19;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // HOMEWORK
        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT EVERYTHING IN BETWEEN
        // IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER Z A ' or A K
        // Can we ask user character ? NO!!!!!
        // Ask user for String and pick first character by charAt(0)

        System.out.println("Enter 1 st word with single character to start with");
        String start = scan.next();
        char startAsChar = start.charAt(0);


        System.out.println("Enter 2 nd word with single character to end with");
        String end = scan.next();
        char endAsChar = end.charAt(0);

        for (char iChar = startAsChar; iChar <= endAsChar ; iChar++) {
            System.out.print(iChar + " ");

        }




//        String line = "";
//
//        if(start.charAt(0) < end.charAt(0) ){
//            for (char iChar = start.charAt(0) ; iChar <= end.charAt(0); iChar++) {
//                line += iChar;
//                //System.out.println(line);
//            }
//            System.out.print(line);
//
//        }











    }
}
