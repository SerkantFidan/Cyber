package office_hour;

import java.util.Scanner;

public class  String_Task_12 {
    public static void main(String[] args) {
  //      Task 12:
//        Given a String with at least two characters
//        swamp first character with last character
//        for example
//        Java --> aavJ , Kawap --> pawaK
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String with at least two characters");
        String name = scan.next();
        if(name.length()>= 2) {
            int nameLastIndex = name.length() - 1;
            String swamp = "" + name.charAt(nameLastIndex) + name.substring(1, name.length() - 1) + name.charAt(0);
            System.out.println(swamp);
        }else{
            System.out.println("Please enter at least 2 characters");
        }




    }
}
