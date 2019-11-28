package office_hour;

import java.util.Scanner;

public class Replit_59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String userFullName1 = scan.nextLine();
        String userFullName2 = scan.nextLine();
        String secretFullName1 = "Esra Sogut";
        String secretFullName2 = "Serra Fidan";




        if(userFullName1.equalsIgnoreCase(secretFullName1) || userFullName1.equalsIgnoreCase(secretFullName2)){
            System.out.println("User found!");
        }else if(userFullName2.equalsIgnoreCase(secretFullName1) || userFullName2.equalsIgnoreCase(secretFullName2)){
            System.out.println("User found!");
        }else {
            System.out.println("User not found!");
        }




    }
}
