package office_hour;

import java.util.Scanner;

public class Replit_69 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int wordLength = word.length();
        int wordEvenFirstHalfLastIndex = word.length()-1/2;
        int wordOddHalfIndex = word.length()-1/2;

        String firstHalfEvenWord = word.substring(0,(word.length()-1/2)+1);
      //  String wordOddHalf = word.charAt(word.length()-1/2)+1);


        if(word.length() % 2 == 0){
            System.out.println(firstHalfEvenWord);

        }else{
   //         System.out.println(wordOddHalf);
        }
    }
}
