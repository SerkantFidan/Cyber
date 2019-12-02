package day16;

import java.util.Scanner;

public class SecondWordGetter {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        //System.out.println("Enter a sentence with 3 words");
        //String word = scan.nextLine();


        // getting location of space remind me of indexOf
        // getting String inside another String by beginning and ending index
        // remind me of substring

//        String sentence = "I Love Java";
        String sentence = "You Understand Java";
        System.out.println(sentence.length());
        String secondWord ;
        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println(sentence.substring(2,6));
        secondWord = sentence.substring(firstSpaceIndex+1 , lastSpaceIndex);
        System.out.println("secondWord = " + secondWord);

        /// How to get first word
        // in plain English : first word is starting from first character till first space
        String firstWord = sentence.substring(0, firstSpaceIndex);
        // how do we print out a variable with value using shortcut : soutv then tab
        System.out.println("firstWord = " + firstWord);

        // how to get last word from any sentence
        // last word in a sentence means from last space till the rest
        String lastWord = sentence.substring(lastSpaceIndex + 1);
        System.out.println("lastWord = " + lastWord);












    }
}
