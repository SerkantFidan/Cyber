package day14;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a name");
//        String name  = scan.next();
//        int length = name.length();
//        //System.out.println(name.charAt(length-1));
//        System.out.println(name.substring(length-3));
//        System.out.println(name.substring(1,3));
//        System.out.println(name.indexOf("ra12"));

        int total = 0;
        System.out.println("Enter a positive integer");
        int nextNum = scan.nextInt();

        while(nextNum > 0){
            total = total + nextNum ;
            nextNum = scan.nextInt();

        }
        System.out.println("Sum of total = " + total);










    }
}
