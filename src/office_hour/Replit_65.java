package office_hour;

import java.util.Scanner;

public class Replit_65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        int lastIndexWord1= word1.length() - 1;
        int lastIndexWord2= word2.length() - 1;

        System.out.println(word1.substring(0,lastIndexWord1+1) + word2.substring(0,lastIndexWord2+1)+
                word2.substring(0,lastIndexWord2+1) + word1.substring(0,lastIndexWord1+1) );










    }
}
