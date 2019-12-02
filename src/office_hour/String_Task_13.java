package office_hour;

import java.util.Scanner;

public class String_Task_13 {
    public static void main(String[] args) {

 //       Task 13:
//        Given a String with 3 characters
//        swamp first character with last character
//        and check whether new String is same as old one
//        if so print Palindrome
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string with 3 characters");

        String name = scan.next();
        String reverseName = "" + name.charAt(2) + name.charAt(1) + name.charAt(0);
        if(name.equalsIgnoreCase(reverseName)){
            System.out.println("Palindrome");
        }else {
            System.out.println("It is not Palindrome");
        }




    }

}
