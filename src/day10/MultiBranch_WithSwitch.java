package day10;

public class MultiBranch_WithSwitch {
    public static void main(String[] args) {
        String order = "";
        int itemNumber = 88;
        // what data type of variable I can use here
        // byte, short, int, char, String
        switch(itemNumber){
           case 11:
               System.out.println("You have selected 11");
               order = "Burger";
               break;// if break does not show up here
                       // it will just move on to next case
            case 5:
               System.out.println("You have selected 5");
               order = "French Fry";
               break;
            case 8:
               System.out.println("You have selected 8");
               order = "Nuggets";
               break;
            case 35:
               System.out.println("You have selected 35");
               System.out.println("YAY!!! YUM!!!");
               System.out.println("ENJOY");
               order = "IceCream";
               break;
            case 55:
               System.out.println("You have selected 55");
               order = "Coke";
               break;
            default:
                System.out.println("YOU HAVE SELECTED UNKNOWN ITEM NUMBER!!");
                order = "Unkknown";
                break; //after default, break; optional
        }
        System.out.println("Your order is " + order);
//        if(itemNumber == 11){
//            System.out.println("You have selected 11");
//            order = "Burger";
//        }else if(itemNumber == 5){
//            System.out.println("You have selected 5");
//            order = "French Fry";
//        }else if(itemNumber == 8){
//            System.out.println("You have selected 8");
//            order = "Nuggets";
//        }else if(itemNumber == 35){
//            System.out.println("You have selected 35");
//            System.out.println("YAY!!! YUM!!!");
//            System.out.println("ENJOY");
//            order = "IceCream";
//        }else if(itemNumber == 55){
//        System.out.println("You have selected 55");
//            order = "Coke"
//        }else{
//            System.out.println("YOU HAVE SELECTED UNKNOWN ITEM NUMBER!!");
//        }
//        System.out.println("Your order is " + order);
    }
}
