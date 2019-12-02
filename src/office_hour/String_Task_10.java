package office_hour;

import java.util.Scanner;

public class String_Task_10 {
    public static void main(String[] args) {

  //      Task 10:
//        Ask user to enter sentence with 3 words
//        For example I love Java
//        write a program to print second word

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence with 3 words");
        String sentence = scan.nextLine();
        int indexOfFirstSpace = sentence.indexOf(" ");
        int lastIndexOfSpace = sentence.lastIndexOf(" ");
        System.out.println(sentence.substring(indexOfFirstSpace + 1, lastIndexOfSpace));





    }
}
