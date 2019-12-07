package day19;

import java.util.Scanner;

public class ForLoopStairCase {
    public static void main(String[] args) {
//    *
//    * *
//    * * *
//    * * * *

        String star = "";

//        star ="* ";
//        System.out.println(star);
//
//        star = star + "* ";  // star = star + star
//        System.out.println(star);
//
//        star = star + "* ";
//        System.out.println(star);
//
//        star = star + "* ";
//        System.out.println(star);

        for (int i = 1; i <= 4; i++) {

            star += "* "; // star = star + "* ";
            System.out.println(i + " " + star);

        }








    }
}
