package office_hour;

import java.util.Scanner;

public class replt_86 {
    public static void main(String[] args) {
//        Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
////        Ask for the first guest name.
////        Then ask does user want to enter one more guest.
////        If yes - take input from.
////        If not - finish the program and print list of the guests.
////
////        Example of the program:
////
////        Please enter guest name:
////        Nick
////        Do you want to enter new guest name:
////        yes
////        Please enter guest name:
////        Linda
////        Do you want to enter new guest name:
////        no
////
////        Guest's list: Nick, Linda
////
        Scanner input = new Scanner(System.in);
        String guestsList = "";

        for (int i = 0; i < 2; i++) {

            System.out.println("Please enter guest name:");
            String guestName = input.next();
            guestsList = guestsList + guestName;
            System.out.println("Do you want to enter new guest name:");
            String a = input.next();

            if (a.equals("yes")) {
               guestsList = guestsList + ", ";

                i--;
            }

        }

        System.out.println("Guest's list: " + guestsList);

    }
}
