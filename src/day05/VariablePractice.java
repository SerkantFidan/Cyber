package day05;

public class VariablePractice {
    public static void main(String[] args) {
        // 8 primitive
        /*
         line1
         line2
         line3
         Block comment, everything in between will be seen as comment

         whole numbers : byte, short, int, long
         fractional numbers : float, double
         logical : boolean (true, false)
         character : char (single character in single quote)

         usually by default for whole numbers: just use int
         usually by default for fractional numbers: just use double

         is String part of Primitive types? :  NOOOO!!!!!!!
         String is sequence of character
         */

        int birthYear = 1984 ;
        int currentYear = 2019 ;
        int age = currentYear - birthYear ;
        System.out.println("I was born in year " + birthYear + ", and I am " + age + " years old.");

        int myCurrentSpeed = 50;
        int speedLimit = 30;
        int overTheLimit = myCurrentSpeed - speedLimit;
        System.out.println("You are driving " + overTheLimit + " mpH more than speed limit.");









    }
}
