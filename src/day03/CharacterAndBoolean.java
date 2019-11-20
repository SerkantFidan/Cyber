package day03;

public class CharacterAndBoolean {
    public static void main(String[] args) {
        char grade = 'A';
        char emailSign = '@';
        System.out.println("My score for Math is " + grade);

        boolean isLightOn = true ;
        System.out.println("Did you turn off  the light? : " + isLightOn);
        isLightOn = false;
        System.out.println("Did you turn off the light? : " +  isLightOn);

        boolean areYouSleeping = false;
        System.out.println("Are you sleeping ?: " + areYouSleeping);

        int myLetter3 = 'A' ;
        System.out.println(myLetter3);
        char myLetter4 = 106;
        System.out.println(myLetter4);
        char myLetter5 = '8' ;
        System.out.println(myLetter5); //------> 8
        int myLetter6 = 56 ;
        System.out.println(myLetter6); //------> 56
        int myLetter7 = '8' ;
        System.out.println(myLetter7); //------> 56
        int myCup = (int) 100;
        System.out.println(myCup); //------> 100
    }
}
