package office_hour;
import java.util.Scanner;
public class reply30 {
    public static void main(String[] args) {

                //WRITE YOUR CODE HERE:
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter Item1, count and its price:");
                String item1 = scan.next();
                int count1 = scan.nextInt();
                double price1 = scan.nextDouble();
                System.out.println("Item1 is \"Tomatoes\", count is " + count1 +", price is " + price1);

                System.out.println("Enter Item2, count and its price:");
                String item2 = scan.next();
                int count2 = scan.nextInt();
                double price2 = scan.nextDouble();
                System.out.println("Item2 is \"Cheese\", count is " + count2 +", price is " + price2);

                System.out.println("Enter Item3, count and its price:");
                String item3 = scan.next();
                int count3 = scan.nextInt();
                double price3 = scan.nextDouble();
                System.out.println("Item3 is \"Apples\", count is " + count3 +", price is " + price3);


                double totalPrice = count1*price1+count2*price2+count3*price3;
                String reports = "Item1: " + item1 + " Price: " + count1*price1 + ", Item2 : " + item2 + " Price: " +count2*price2+ ", Item3 : " + item3 + " Price: " +count3*price3;
                        //"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
                if(count1 > 0 && count2 == 0 && count3 >0){
                    totalPrice= count1*price1+count3*price3;
                    reports= "Item1: " + item1 + " Price: " + count1*price1 + ", Item3 : " + item3 + " Price: " +count3*price3;
                    System.out.println("Total price: " + totalPrice);
                    System.out.println(reports);
                }else if(count1 == 0 && count2 > 0 && count3 >0){
                    totalPrice= count2*price2+count3*price3;
                    reports= "Item2: " + item2 + " Price: " + count2*price2 + ", Item3 : " + item3 + " Price: " +count3*price3;
                    System.out.println("Total price: " + totalPrice);
                    System.out.println(reports);
                }else if(count1 > 0 && count2 > 0 && count3 == 0){
                    totalPrice= count1*price1+count2*price2;
                    reports= "Item1: " + item1 + " Price: " + count1*price1 + ", Item2 : " + item2 + " Price: " +count2*price2;
                    System.out.println("Total price: " + totalPrice);
                    System.out.println(reports);
                }

//        - Hint :
//        The unit test assumes that item1 count is always more than 0
//        The only situations you need to handle are either item2 count is 0 or item3 count is 0.
//        Think simple and just handle the only item2 is 0 or  only item3 is 0 branches
//        -build the report variable by concatenating Strings and double price values:
//        -do not include items that have count 0, use if statement !
//                -Calculate total price for the item and concatenate like below
//
//        "Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
//        Explanation: (Item2 "Cheese" is not included since its count is 0)
//
//        - Print the value of report variable
//
//                - Print total Price:
//        "Total price: 42.3"


       // Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)
       // -calculate totalPrice for all items only if the item's count is more than 0!
//        -build the report variable by concatenating Strings and double price values:
//        -do not include items that have count 0, use if statement !
//                -Calculate total price for the item and concatenate like below
//
//        "Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
//        Explanation: (Item2 "Cheese" is not included since its count is 0)
//
//        - Print the value of report variable
//
//                - Print total Price:
//        "Total price: 42.3"


//import java.util.Scanner;
//        public class Main {
//            public static void main(String[] args) {
//                //WRITE YOUR CODE HERE:
//
//                Scanner scan = new Scanner(System.in);
//
//                System.out.println("Enter Item1, count and its price:");
//                System.out.println("Enter Item2, count and its price:");
//                System.out.println("Enter Item3, count and its price:");
//
//                String item1 = scan.next();
//                int count1 = scan.nextInt();
//                double price1 = scan.nextDouble();
//
//                String item2 = scan.next();
//                int count2 = scan.nextInt();
//                double price2 = scan.nextDouble();
//
//                String item3 = scan.next();
//                int count3 = scan.nextInt();
//                double price3 = scan.nextDouble();
//
//                double totalPrice = count1*price1+count2*price2+count3*price3;
//
//                String reports = "Item1: Tomatoes Price: " + count1*price1 + ", Item2: Cheese Price: " + count2*price2 + ", Item3: Apples Price: " + count3*price3;
//
//                if(count1 > 0 && count2 == 0 && count3 >0){
//                    totalPrice= count1*price1+count3*price3;
//                    reports= "Item1: Tomatoes Price: " + count1*price1 + ", Item3: Apples Price: " + count3*price3;
//                    System.out.println(reports);
//                    System.out.println("Total price: " + totalPrice);
//
//                }else if(count1 == 0 && count2 > 0 && count3 >0){
//                    totalPrice= count2*price2+count3*price3;
//                    reports= "Item2 : Cheese Price: " + count2*price2 + ", Item3 : Apples Price: " + count3*price3;
//                    System.out.println(reports);
//                    System.out.println("Total price: " + totalPrice);
//
//                }else if(count1 > 0 && count2 > 0 && count3 == 0){
//                    totalPrice= count1*price1+count2*price2;
//                    reports= "Item1 : Tomatoes Price: " + count1*price1 + ", Item2 : Cheese Price: " + count2*price2;
//                    System.out.println(reports);
//                    System.out.println("Total price: " + totalPrice);
//                }
//





            }
}
