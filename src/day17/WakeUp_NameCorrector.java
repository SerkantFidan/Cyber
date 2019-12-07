package day17;

import java.util.Scanner;

public class WakeUp_NameCorrector {
    public static void main(String[] args) {
//        String name = "esra";
//        String name2 = "";
//        name2 = name.substring(0,1).toUpperCase() + name.substring(1);
//        System.out.println(name2);


        //             01234567
        String name = "kHumAyRa";

        // substring method copy the part of String inside another String
        // it has 2 version :
        // 1,  start with certain index and end at ending index
        // 2,  start with certain index then get the rest of the String

        // get the first character -->> make it uppercase
        // get the rest of the characters starting from 2nd character
        /// then make it lowercase
        //  eventually concatenate them
//         String nameFixed = (name.charAt(0)+"").toUpperCase() ;
//                nameFixed = nameFixed + name.substring(1).toLowerCase();

        String nameFixed = name.toUpperCase().substring(0, 1);
        nameFixed += name.substring(1).toLowerCase();

        System.out.println("nameFixed = " + nameFixed);

        // make whole name uppercase the get the first character
        // get the rest of the characters starting from 2nd character
        /// then make it lowercase
        //  eventually concatenate them

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name2= scan.next();
        System.out.println(name2.toUpperCase().substring(0,1) + name2.toLowerCase().substring(1));























    }

}
