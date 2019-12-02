package day16;

import java.util.Scanner;

public class GiveMe5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
       // int userNumber = scan.nextInt();

//        if(userNumber !=5 ){
//
//            System.out.println("HEY YOU DID NOT GIVE ME 5");
//        }
        int userNumber = 0;
        while(userNumber!=5){
            System.out.println("GIVE ME FIVE!!!");
            userNumber = scan.nextInt();
        }
        System.out.println("END OF THE PROGRAM");



    }

}
