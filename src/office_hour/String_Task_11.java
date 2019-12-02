package office_hour;

import java.util.Scanner;

public class String_Task_11 {
    public static void main(String[] args) {
  //      Task 11:
//        Ask user to enter sentence with more than 1 word
//        For example I love Java
//        write a program to
//        print first word and last word

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter sentence with more than 1 word");

        String sentence = scan.nextLine();

        String substring1 = sentence.substring(0,sentence.indexOf(" "));
        System.out.println("First word: " + substring1);

        String substring2 = sentence.substring(sentence.lastIndexOf(" ") + 1);
        System.out.println("Last word: " + substring2);







    }
}
