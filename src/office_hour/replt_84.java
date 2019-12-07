package office_hour;

import java.util.Scanner;

public class replt_84 {
    public static void main(String[] args) {

// Online Book Merchants offers premium customers 1 free book
// with every purchase of 5 or more books and offers 2 free books
// with every purchase of 8 or more books.
// It offers regular customers 1 free book with every purchase of 7 or more books,
// and offers 2 free books with every purchase of 12 or more books.
//Write a program that assigns freeBooks the appropriate value based on the values of the boolean variable isPremiumCustomer
// and the int variable nbooksPurchased. Print amount of freeBooks into the console.

        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you a premium customer?");
        boolean isPremiumCustomer = scan.nextBoolean();
        System.out.println("Enter count books purchased");
        int nbooksPurchased = scan.nextInt();

        if(isPremiumCustomer){
            if(nbooksPurchased >= 5 && nbooksPurchased <8) {
                System.out.println("1 free book");
            }else if(nbooksPurchased >= 8){
                System.out.println("2 free books");
            }

        }else if(!isPremiumCustomer) {
            if (nbooksPurchased >= 7 && nbooksPurchased < 12) {
                System.out.println("1 free book");
            } else if (nbooksPurchased >= 12) {
                System.out.println("2 free books");

            }

        }






    }
}
