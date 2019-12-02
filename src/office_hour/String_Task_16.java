package office_hour;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class String_Task_16 {
    public static void main(String[] args) {

 //       Task 16:
//        Enter user to ask two words
//        and store it into word1 word2 String variables
//        if word1 contains word2 ,
//                print the location of word2 in word1
//        for example ABCDE , BC  -->> BC is at index 1 in word1
//        then replace word2 part of word1 with ZZZ
//        for example ABCDE , BC  -->> AZZZDE
//        if word2 exists in word1 , replace word1 with ZZZ
//        for example BC , ABCDE    -->> AZZZDE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words");
        String word1 = scan.next();
        String word2 = scan.next();
        int word2Index = word1.indexOf(word2);
        if(word1.contains(word2)){
            System.out.println(word2 + " is at index " + word2Index + " in word1");

        }else if(word2.contains(word1)){
            System.out.println(word2.replace(word1,"ZZZ"));
        }







    }
}
