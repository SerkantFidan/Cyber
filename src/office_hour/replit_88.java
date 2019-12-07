package office_hour;

import java.util.Scanner;

public class replit_88 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

 //       int lengthWord = word.length();
//        System.out.println("lengthWord = " + lengthWord);
//        int lengthCat = 3;
//        int lengthDog = 3;
 //       int lastIndexWord = word.length()-1;
//
//        String a =word.replace("cat","");
//        int aLength = a.length();
//        System.out.println("a length = " + aLength);
//
//        String b =word.replace("dog","");
//        int bLength = word.replace("dog","").length();
//        System.out.println("b length = " + bLength);
//
//        countOfCats = (lengthWord-aLength)/ 3 ;
//        System.out.println("countOfCats = " + countOfCats);
//
//        countOfDogs = (lengthWord-bLength) / 3 ;
//        System.out.println("countOfDogs = " +  countOfDogs);
//
//        if(countOfCats ==
//                countOfDogs ){
//            System.out.println("true");
//
//        }else{
//            System.out.println("false");
//        }


//        for (int x = 0; x <= word.length()-3 ; x+=3) {
//            System.out.println(word.substring(x,x+3));
//            countOfCats ++;
//            countOfDogs ++;
//
//            if(countOfCats == countOfDogs ){
//                System.out.println("true");
//
//            }else{
//                System.out.println("false");
//            }
//
//        }

        for (int i = 0; i <= word.length() - 3; i++) {
            if (word.substring(i, i +3).equals("cat")){
                countOfCats++;
            }
            if (word.substring(i, i + 3).equals("dog")) {
                countOfDogs++;
            }
        }
        if (countOfCats == countOfDogs) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }



















    }
}
