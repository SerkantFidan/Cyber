package office_hour;

import java.util.Scanner;

public class String_Task_14 {
    public static void main(String[] args) {
 //       Task 14:
//        Ask user to enter sentence with any number of words
//        For example I love Java Java Java Java
//        write a program to print last word
//        remove last word from the sentence
//        check weather remaining part still contains last word
//        for example :
//        1, I love Java Java Java Java  -->> Java
//        2, I love Java Java Java
//        3, I love Java Java Java still contains last word
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence with any number of words");
        String sentence = scan.nextLine();

        int lastWordIndex = sentence.lastIndexOf(" ") + 1;
        String lastWord = sentence.substring(lastWordIndex );
        System.out.println(sentence.substring(lastWordIndex ));

        sentence = sentence.substring(0,lastWordIndex-1);
        System.out.println(sentence);

        System.out.println(sentence.contains(lastWord));









    }
}
