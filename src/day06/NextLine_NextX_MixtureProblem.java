package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {
        Scanner blabla = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = blabla.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("What is your age?");
        int age = blabla.nextInt();// age girdikten sonra enter basmadan once space birakip adres yada baska birsey girdiginde yazdigin seyi enterlayinca bir sonraki satira atlatiyor.
        //String age = blabla.nextLine();
        // we just want below line to capture ENTER keyboard input
        // so that it does not accidentally get captured by
        // the nextLine  we use to capture address
       // blabla.nextLine(); //
        System.out.println("Your age is " + age);
        blabla.nextLine();
        System.out.println("What is your address?");
        String address = blabla.nextLine();
        System.out.println("Your Address is " + address);





    }
}
