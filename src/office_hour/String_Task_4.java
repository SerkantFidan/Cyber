package office_hour;

import java.util.Scanner;

public class String_Task_4 {
    public static void main(String[] args) {
        //        Task 4:
//        Ask user to enter a word with at least 3 characters
//        print the first character
//        print the last character
//        print the middle character
//        for example : Uighur
//        first character : U
//        last character  : r
//        middle character: g
//                (if the length is even number get the one on the left)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word with at least 3 characters");
        String word = scan.next();
        int wordLength = word.length();
        System.out.println(wordLength);
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(wordLength - 1));
        int evenNumberMiddleIndex = word.length()/2 + 1 - 1;
        int oddNumberMiddleIndex = word.length() / 2 + word.length() %2 -1;
        if(wordLength % 2 == 0){
            System.out.println(word.charAt(evenNumberMiddleIndex));
        }else {
            System.out.println(word.charAt(oddNumberMiddleIndex));
        }





    }
}
