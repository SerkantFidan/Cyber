package office_hour;

import java.util.Scanner;

public class String_Task_1 {
    public static void main(String[] args) {


//        Task 1:
//        Given a String with any possible length including 0
//        print first 2 characters only if the String has more than 1 character
//        if the String is empty print Empty String
//        else print the first char twice in same Link
//        for example :
//        "abcde" --> ab
//        ""        --> empty String
//        "J"       --> JJ

        //Scanner scan = new Scanner(System.in);
        //String word = scan.next();
        String word = "";


        if(word.length() > 1){
            System.out.println(word.charAt(0) + "" + word.charAt(1));
        }else if(word.length() <= 0){
            System.out.println("Empty String");
        }else {
            System.out.println(word.charAt(0) + "" + word.charAt(0));
        }










//
//

//

//
//
//
//
//
//
//
//        Task 15:
//        Given a String str with 3 characters:
//        for example : DEV
//        Store each character into 3 char variables
//        Store ASCII number of each character into int variables
//        hint : store char into int to get ASCII number
//        Then print it out by concatenating as below :
//        "DEV IS NOW --> D68E69V86"
//        Task 16:
//        Enter user to ask two words
//        and store it into word1 word2 String variables
//        if word1 contains word2 ,
//                print the location of word2 in word1
//        for example ABCDE , BC  -->> BC is at index 1 in word1
//        then replace word2 part of word1 with ZZZ
//        for example ABCDE , BC  -->> AZZZDE
//        if word2 exists in word1 , replace word1 with ZZZ
//        for example BC , ABCDE    -->> AZZZDE










    }
}
