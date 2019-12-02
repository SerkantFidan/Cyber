package office_hour;

import java.util.Scanner;

public class String_Task_6 {
    public static void main(String[] args) {
        //        Task 6:
//        Ask user to enter full name
//        assuming full name is 2 word
//        Write a program generate email account as below:
//        it starts with first character of first name
//        and whole last name then @NightWatch.com
//        for example :
//        Jon Snow -->> JSnow@NightWatch.com

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name");
        String fullName = scan.nextLine();
        char firstCharFullName = fullName.charAt(0);
        int lengthFullName = fullName.length();
        int indexOfLastName = fullName.indexOf(" ")+1;
        System.out.println(fullName.substring(fullName.indexOf(" ")+1));
        String email = firstCharFullName + fullName.substring(fullName.indexOf(" ")+1) + "@NightWatch.com";
        System.out.println(email);




    }
}
