package office_hour;

import java.util.Scanner;

public class String_Task_15 {
    public static void main(String[] args) {
  //      Task 15:
//        Given a String str with 3 characters:
//        for example : DEV
//        Store each character into 3 char variables
//        Store ASCII number of each character into int variables
//        hint : store char into int to get ASCII number
//        Then print it out by concatenating as below :
//        "DEV IS NOW --> D68E69V86"
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String str with 3 characters");
        String str = scan.next();

        int strFirstChar = str.charAt(0);
        System.out.println(strFirstChar);

        int strSecondChar = str.charAt(1);
        System.out.println(strSecondChar);

        int strLastChar = str.charAt(2);
        System.out.println(strLastChar);


        System.out.println(str + " IS NOW --> "+str.substring(0,1) + strFirstChar +
                str.substring(1,2) + strSecondChar + str.substring(2,3) + strLastChar );












    }
}
