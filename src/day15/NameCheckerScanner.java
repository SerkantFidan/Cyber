package day15;

import java.util.Scanner;

public class NameCheckerScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name please: ");
        String name = scan.nextLine();

        int lengthOfTheName = name.length();
        System.out.println("Length Of The Name = " + lengthOfTheName);

        if (lengthOfTheName < 4) {
            System.out.println("Short Name");
            // }else if(lengthOfTheName >= 4 && lengthOfTheName <= 11){
            // lengthOfTheName >= 4
        } else if (lengthOfTheName <= 11) {
            System.out.println("Medium Name");
        } else {
            System.out.println("Longer Name");
        }
    //============================================================
        // true            ||     true    -------> true
        if(name.contains("a") || name.contains("e")){
            System.out.println("Name contains a or e");
        }else{
            System.out.println("I don't have both a or e in my name");

        }








    }
}
