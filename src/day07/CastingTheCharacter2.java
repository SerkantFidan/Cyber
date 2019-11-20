package day07;

public class CastingTheCharacter2 {
    public static void main(String[] args) {
//        char myFirstChar = (char) 100;
//        System.out.println(myFirstChar);


        // find out your number of each character in your first name
        // this is implicitly turning 'A' to it's number representation in ascii table

        int myFirstNameLetter1 = 'E';
        int myFirstNameLetter2 = 'S';
        int myFirstNameLetter3 = 'R';
        int myFirstNameLetter4 = 'A';
        System.out.println(myFirstNameLetter1);
        System.out.println(myFirstNameLetter2);
        System.out.println(myFirstNameLetter3);
        System.out.println(myFirstNameLetter4);

        int firstCharNum = 'A' ; // you may also write it as int firstCharNum = (int)'A';
        System.out.println("number of letter A is " + firstCharNum);

        // or OPTIONALLY you can directly cast it to number and print
        System.out.println("number of letter K is " + (int) 'K');

        char letterA = 'a';
        //adding a character to a int number will result in int
        //(int) letterA + 1
        System.out.println(letterA + 1);
        System.out.println(" " + letterA + 1);//-------->anlamadim

    }
}
