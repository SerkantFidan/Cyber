package day17;

import java.util.Scanner;

public class NameInReverseOrder_Scanner {
    public static void main(String[] args) {
        //  assuming you don't know the length of your name
        //  write a program to print your name in reverse order
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();

        int lastCharacterIndex = name.length() -1;

        while(lastCharacterIndex >= 0){ // (x <= name.length()-1) -->> x <= name.lastIndexOf()

            System.out.println("index " + lastCharacterIndex + " : " + name.charAt(lastCharacterIndex));
            --lastCharacterIndex;
        }
        System.out.println();

        String name2 = "esra fidan";
        int name2LastIndexOf = name2.lastIndexOf("esra fidan");
        System.out.println(name2LastIndexOf);

















    }
}
