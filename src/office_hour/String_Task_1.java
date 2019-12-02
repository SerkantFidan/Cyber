package office_hour;

import java.util.Scanner;

public class String_Task_1 {
    public static void main(String[] args) {


//        Task 1:
//        Given a String with any possible length including 0
//        print first 2 characters only if the String has more than 1 character
//        if the String is empty print Empty String
//        else print the first char twice in same Link
//        for example :
//        "abcde" --> ab
//        ""        --> empty String
//        "J"       --> JJ

        //Scanner scan = new Scanner(System.in);
        //String word = scan.next();
        String word = "";


        if(word.length() > 1){
            System.out.println(word.charAt(0) + "" + word.charAt(1));
        }else if(word.length() <= 0){
            System.out.println("Empty String");
        }else {
            System.out.println(word.charAt(0) + "" + word.charAt(0));
        }










//
//

//

//
//
//
//
//
//
//
//
//









    }
}
