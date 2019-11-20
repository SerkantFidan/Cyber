package day06;

public class Exercise {
    public static void main(String[] args) {
        int myCent = 200;
        myCent -= 74 ;

        System.out.println("Geriye kalan cent : " + myCent);

        int quarter = myCent/ 25 ;
        int penny1 = myCent % 25 ;
        System.out.println("quarter is : " + quarter);
        System.out.println("penny1 is : " + penny1);

        int dime = myCent / 10 ;
        int penny2 = myCent % 10 ;
        System.out.println("dime is : " + dime);
        System.out.println("penny2 is : " + penny2);

        int nickel = myCent / 5 ;
        int penny3 = myCent %  5 ;
        System.out.println("nickel is : " + nickel);
        System.out.println("penny3 is : " + penny3);












    }

}
