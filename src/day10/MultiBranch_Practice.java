package day10;

public class MultiBranch_Practice {
    public static void main(String[] args) {
        System.out.println("Welcome to McDonald, what can i get for you");

        // At the McDonald Drive thru
        System.out.println("Welcome to McDonald , what can I get for you");

        /*
         * 11, Burger
         * 5, French Fry
         * 8, Nuggets
         * 35, Ice Cream
         * */
        String order = "";
        int itemNumber = 35;
        if(itemNumber == 11){
            System.out.println("You have selected 11");
            order = "Burger";
        }else if(itemNumber == 5){
            System.out.println("You have selected 5");
            order = "French Fry";
        }else if(itemNumber == 8){
            System.out.println("You have selected 8");
            order = "Nuggets";
        }else if(itemNumber == 35){
            System.out.println("You have selected 35");
            System.out.println("YAY!!! YUM!!!");
            System.out.println("ENJOY");
            order = "IceCream";
        }else if(itemNumber == 55){
            System.out.println("You have selected 55");
            order = "Coke";
        }else{
            System.out.println("YOU HAVE SELECTED UNKNOWN ITEM NUMBER!!");
        }
        System.out.println("Your order is " + order);



    }
}
