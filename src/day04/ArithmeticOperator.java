package day04;

public class ArithmeticOperator {
    public static void main(String[] args) {

        // arithmetic operator on between two int -->> another int
        //System.out.println( 5 + 3); // 8
        //System.out.println( 5 - 3); // 2
        //System.out.println( 5 * 3); // 15
        //System.out.println( 5 / 3); // 1


        // arithmetic operator on between two numerical data type
        // the final result will be larger data type
        //System.out.println( 5 + 3.0d ); // 8.0
        //System.out.println( 5 - 3.0d ); // 2.0
        //System.out.println( 5 * 3.0d ); // 15.0
        //System.out.println( 5 / 3.0f ); // 1.66
        //System.out.println( 5 / 3.0d ); // 1.

        //store above numbers in variables
        // and replace above statements with variables instead
        // dataType ressult1= the calculation here
        //System.out.println(ressult1);
       int num1 = 5;
       double num2 = 3.0d;
       float num3 = 3.0f;
        double ressult1 = num1 + num2;
        double ressult2 = num1 - num2;
        double ressult3 = num1 * num2;
        double ressult4 = num1 / num2;
        float ressult5 = num1 / num3;

        System.out.println(ressult1);
        System.out.println(ressult2);
        System.out.println(ressult3);
        System.out.println(ressult4);
        System.out.println(ressult5);













    }
}
