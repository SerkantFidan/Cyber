package day15;

public class ReplaceMethod {
    public static void main(String[] args) {
        // reolace method of the String
        // It will go through all part of String and replace
        // any match with the new String

        String message = "I love Pumpkin , Pumpkin IS FUN!";

        message.replace("Pumpkin","Java!");
        System.out.println(message);
        message = message.replace("Pumpkin","Java!");
        System.out.println(message);


        // "Happy Thanks Giving to All!!" --->> "Happy Thanksgiving to All!!


        // what if i want to replace space from everywhere





    }
}
