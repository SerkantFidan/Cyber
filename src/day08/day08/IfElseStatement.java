package day08.day08;

public class IfElseStatement {
    public static void main(String[] args) {
        int speedLimit = 60 ;
        int yourCurrentSpeed = 145 ;
        // if the yourCurrentSpeed is more than speed limit
        // get pulled over by the police
        // given ticket by the police
        // taken away some points on your license
        // go to court

        boolean IamSpeeding = yourCurrentSpeed > speedLimit ;
        // INSIDE PARANTHESIS WE CAN ONLY PUT
        // BOOLEAN VALUE : TRUE OR FALSE
        // BOOLEAN VARIABLE : IamSpeeding
        // ANY EXPRESSION THAT RETURN BOOLEAN VALUE

        // if (true ) {
         //if(IamSpeeding){
        if( yourCurrentSpeed > speedLimit ){

             System.out.println("Get pulled over by the police");
             System.out.println("Given ticket by the police");
             System.out.println("Taken away some points on your license");
             System.out.println("Go to court");
         }else {
             System.out.println("Go shopping !!");
             System.out.println("Buy IceCream !!");
             System.out.println("Enjoy your day !!");
         }
        // NOT if statement
        System.out.println("THE END");


        // if not over the limit
        // go shopping !!


        // outside if statement , say the end



    }
}
