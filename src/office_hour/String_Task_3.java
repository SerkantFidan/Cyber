package office_hour;

import java.util.Scanner;

public class String_Task_3 {
    public static void main(String[] args) {
 //       Task 3:
//        Ask user to enter full name
//        assuming full name is 2 word
//        Write a program to print users initials
//        for example :
//        Jon Snow -->> Initial is JS
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name");
        String fullName = scan.nextLine();
        int lengthFullName = fullName.length();
        System.out.println(lengthFullName);
        System.out.println(fullName.indexOf(" "));
        System.out.println("Initial is " + fullName.charAt(0) + "" + fullName.charAt(fullName.indexOf(" ")+ 1) );







    }
}
