package day07;

public class CastingTheCharacter {
    public static void main(String[] args) {
        char grade = 'B';
        System.out.println(grade);

        //'B' is represented by 66 in ascii table
        //here type char is automatically widened to int
        //and stored as number
        int letterInNUmber = 'B';
        System.out.println(letterInNUmber);

        int letterInNUmber2 = 'b';
        System.out.println(letterInNUmber2);

        //------------------------------------------------

        // saving the number as char
        // so we can get the character representation
        // of the number in ascii table
        char myFirstChar = (char) 100;
        System.out.println(myFirstChar);
















    }

}
