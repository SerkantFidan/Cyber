package day17;

import java.util.Scanner;

public class WakeUp_FullNameCorrector {
    public static void main(String[] args) {
        //                 0123456789
        String fullName = "arYa sTarK";
        String firstName = fullName.substring(0,4);
        String lastName = fullName.substring(5);

        String firstNameCorrected = firstName.toUpperCase().substring(0,1) + // ARYA -->> A
                firstName.toLowerCase().substring(1); // arya -->> rya

        System.out.println("firstNameCorrected = " + firstNameCorrected);

        String lastNameCorrected = lastName.toUpperCase().substring(0,1) +
                lastName.toLowerCase().substring(1);

        System.out.println("lastNameCorrected = " + lastNameCorrected);

        fullName = firstNameCorrected + " " + lastNameCorrected;
        System.out.println(fullName);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");
        String yourFullName = scan.nextLine();
        int lengthYourFullName = yourFullName.length();
        int lastIndexYourFullName = lengthYourFullName - 1;
        int IndexFirstSpace = yourFullName.indexOf(" ");
        System.out.println(yourFullName.toUpperCase().substring(0,1) + yourFullName.toLowerCase().substring(1,IndexFirstSpace) + " "+
        yourFullName.toUpperCase().substring(IndexFirstSpace + 1,IndexFirstSpace + 2) + yourFullName.toLowerCase().substring(IndexFirstSpace+2) );










    }
}
