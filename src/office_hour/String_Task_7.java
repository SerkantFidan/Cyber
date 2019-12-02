package office_hour;

import java.util.Scanner;

public class  String_Task_7 {
    public static void main(String[] args) {

        //        Task 7:
//        Ask user to enter valid email address
//        for example :
//        JSnow@NightWatch.com or
//        Arya@KingsLanding.edu
//        print 3 part of the email separately
//        for example :
//        Part1 -> JSnow  Part2 -> NightWatch Part3 ->com
//        Part1 -> Arya   Part2 -> KingsLanding Part3 ->edu
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter valid email address");

        String email = scan.nextLine();

        int lastIndexOfPart1 = email.lastIndexOf("@");
        System.out.println(lastIndexOfPart1);
        System.out.println(email.substring(0,lastIndexOfPart1 ));

        int indexOfPart2 = email.indexOf("@") + 1;
        int lastIndexOfPart2 = email.lastIndexOf(".");



        System.out.println(email.substring(indexOfPart2,lastIndexOfPart2 ));

        int indexOfPart3 = email.indexOf(".") + 1;
        System.out.println(email.substring(indexOfPart3) );

        email = email.substring(0,lastIndexOfPart1) +"@"+email.substring(indexOfPart2,lastIndexOfPart2 )+"."+email.substring(indexOfPart3);
        System.out.println(email);









    }
}
