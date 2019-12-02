package office_hour;

import java.util.Scanner;

public class String_Task_9 {
    public static void main(String[] args) {
 //       Task 9:
//        Ask user to enter a valid URL in below format
//        www.blackfriday.com
//        Write a program to print first Index of .(dot)
//                and last index of .(dot)
//                and eventually print the domain
//        for example :
//        www.nightwatch.com  --->> blackfriday

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid URL");
        String webAddress = scan.nextLine();
        if(webAddress.startsWith("www.") && webAddress.endsWith(".com")) {
            int firstIndexDot = webAddress.indexOf(".");
            System.out.println(firstIndexDot);
            int lastIndexDot = webAddress.lastIndexOf(".");
            System.out.println(lastIndexDot);
            System.out.println(webAddress.substring(firstIndexDot + 1, lastIndexDot));
        }else{
            System.out.println("Invalid address");
        }










    }
}
