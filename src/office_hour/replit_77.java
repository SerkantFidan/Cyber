package office_hour;

import java.util.Scanner;

public class replit_77 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int indexOfUnderscore = email.indexOf("_");
        int indexOfAt = email.indexOf("@");
        int indexOfDot = email.indexOf(".");

        System.out.println("First name: "+email.substring(0,1).toUpperCase()+
                email.substring(1,indexOfUnderscore).toLowerCase());

        System.out.println("Last name: " + email.substring(indexOfUnderscore + 1,indexOfUnderscore + 2).toUpperCase()+
                email.substring(indexOfUnderscore + 2,indexOfAt).toLowerCase());

        System.out.println("Domain: " + email.substring(indexOfAt+1,indexOfDot));

        System.out.println("Top-Level Domain: " + email.substring(indexOfDot+1));
    }
}
