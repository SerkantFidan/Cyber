package office_hour;

public class Practice11_13 {
    public static void main(String[] args) {
       //if we go over the range of the type can hold, it does not compile
        //byte sheepCount = 129;
        //if a fractional number appear, compiler automatically assume it's a double
        //so d is optional but highly recommended
        double potatoPrice = 12.99d ;

        float ipadSize1 = 12.9f ;

        double ipadSize2 = 12.9f ;

       //double can hold any type of number because it has largest range
        double bankBalance = 3000 ;
        System.out.println(bankBalance);

        char myFavoriteCharacter = 'A' ;
        char myFavoriteCharacter2 = 65 ; //each character has it's own number representation in ASCII
        char myNine = '9'; // storing 9 as character will work

        // both of them will result letter A because data type is char for both of them
        System.out.println(myFavoriteCharacter);
        System.out.println(myFavoriteCharacter2);

        String todaysTopic = "Arithmetic Operator and Scanner, class duration is 3 hour";

        System.out.println("Topic and duration : \n" + todaysTopic);


    }
}
