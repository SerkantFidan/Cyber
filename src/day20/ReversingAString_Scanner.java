package day20;

import java.util.Scanner;

public class ReversingAString_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();

        int nameLastIndex = name.length()-1;


        for (int i = nameLastIndex; i >= 0 ; i--) {
            System.out.print(""+name.charAt(i));
        }









    }
}
