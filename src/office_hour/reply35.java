package office_hour;

import java.util.Scanner;

public class reply35 {
    public static void main(String[] args) {

//        Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something
//        and display leftover balance after purchase.
//        If item is not in the list, display message: "Invalid item!".
//        If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
//                Hint
//        Use if/ else if / else

//        Example #1
//        input: Hat
//        output: Thank you for your purchase!
//                output: Your current balance is: 75$
//
//        Example #2
//        input: Pants
//        output: Thank you for your purchase!
//                output: Your current balance is: 50$
//
//        Example #3
//        input: Laptop
//        output: Sorry, not enough funds on your gift card!
//
//                Example #4
//        input: Cupcake
//        output: Invalid item!

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter item");
//        System.out.println("Enter price");
//
//        String item = scan.nextLine();
//        double price = scan.nextDouble();
//        double giftCard = 100;
//        double currentBalance = giftCard - price;
//
//        switch (item) {
//            case "Smartphone":
//                if (price < 100) {
//                    System.out.println("Thank you for your purchase!");
//                    System.out.println("Your current balance is: " + currentBalance + "$");
//                } else {
//                    System.out.println("Sorry, not enough funds on your gift card!");
//                }
//                break;
//            case "Laptop":
//                if (price < 100) {
//                    System.out.println("Thank you for your purchase!");
//                    System.out.println("Your current balance is: " + currentBalance + "$");
//                } else {
//                    System.out.println("Sorry, not enough funds on your gift card!");
//                }
//                break;
//            case "Charger":
//                if (price < 100) {
//                    System.out.println("Thank you for your purchase!");
//                    System.out.println("Your current balance is: " + currentBalance + "$");
//                } else {
//                    System.out.println("Sorry, not enough funds on your gift card!");
//                }
//                break;
//            case "USB cable":
//                if (price < 100) {
//                    System.out.println("Thank you for your purchase!");
//                    System.out.println("Your current balance is: " + currentBalance + "$");
//                } else {
//                    System.out.println("Sorry, not enough funds on your gift card!");
//                }
//                break;
//            case "Headphones":
//                if (price < 100) {
//                    System.out.println("Thank you for your purchase!");
//                    System.out.println("Your current balance is: " + currentBalance + "$");
//                } else {
//                    System.out.println("Sorry, not enough funds on your gift card!");
//                }
//                break;
//            case "Pants":
//                if (price < 100) {
//                    System.out.println("Thank you for your purchase!");
//                    System.out.println("Your current balance is: " + currentBalance + "$");
//                } else {
//                    System.out.println("Sorry, not enough funds on your gift card!");
//                }
//                break;
//            case "Hat":
//                if (price < 100) {
//                    System.out.println("Thank you for your purchase!");
//                    System.out.println("Your current balance is: " + currentBalance + "$");
//                } else {
//                    System.out.println("Sorry, not enough funds on your gift card!");
//                }
//                break;
//            case "Socks":
//                if (price < 100) {
//                    System.out.println("Thank you for your purchase!");
//                    System.out.println("Your current balance is: " + currentBalance + "$");
//                } else {
//                    System.out.println("Sorry, not enough funds on your gift card!");
//                }
//                break;
//            case "Blanket":
//                if (price < 100) {
//                    System.out.println("Thank you for your purchase!");
//                    System.out.println("Your current balance is: " + currentBalance + "$");
//                } else {
//                    System.out.println("Sorry, not enough funds on your gift card!");
//                }
//                break;
//            case "Pillow":
//                if (price < 100) {
//                    System.out.println("Thank you for your purchase!");
//                    System.out.println("Your current balance is: " + currentBalance + "$");
//                } else {
//                    System.out.println("Sorry, not enough funds on your gift card!");
//                }
//                break;
//            default:
//                System.out.println("Invalid item!");
//
//
//        }

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        double price = scan.nextDouble();
        double currentBalance = 100.00 - price;

//        if (item.equals("Smartphone")) {
//            if (price <= 100) {
//                System.out.println("Thank you for your purchase!");
//                System.out.println("Your current balance is: " + currentBalance + "$");
//            } else {
//                System.out.println("Sorry, not enough funds on your gift card!");
//            }
//        } else if (item.equals("Laptop")) {
//            if (price <= 100) {
//                System.out.println("Thank you for your purchase!");
//                System.out.println("Your current balance is: " + currentBalance + "$");
//            } else {
//                System.out.println("Sorry, not enough funds on your gift card!");
//            }
//        } else if (item.equals("Charger")) {
//            if (price <= 100) {
//                System.out.println("Thank you for your purchase!");
//                System.out.println("Your current balance is: " + currentBalance + "$");
//            } else {
//                System.out.println("Sorry, not enough funds on your gift card!");
//            }
//        } else if (item.equals("Headphones")) {
//            if (price <= 100) {
//                System.out.println("Thank you for your purchase!");
//                System.out.println("Your current balance is: " + currentBalance + "$");
//            } else {
//                System.out.println("Sorry, not enough funds on your gift card!");
//            }
//        } else if (item.equals("USB cable")) {
//            if (price <= 100) {
//                System.out.println("Thank you for your purchase!");
//                System.out.println("Your current balance is: " + currentBalance + "$");
//            } else {
//                System.out.println("Sorry, not enough funds on your gift card!");
//            }
//        } else if (item.equals("Pants")) {
//            if (price <= 100) {
//                System.out.println("Thank you for your purchase!");
//                System.out.println("Your current balance is: " + currentBalance + "$");
//            } else {
//                System.out.println("Sorry, not enough funds on your gift card!");
//            }
//        } else if (item.equals("Hat")) {
//            if (price <= 100) {
//                System.out.println("Thank you for your purchase!");
//                System.out.println("Your current balance is: " + currentBalance + "$");
//            } else {
//                System.out.println("Sorry, not enough funds on your gift card!");
//            }
//        } else if (item.equals("Socks")) {
//            if (price <= 100) {
//                System.out.println("Thank you for your purchase!");
//                System.out.println("Your current balance is: " + currentBalance + "$");
//            } else {
//                System.out.println("Sorry, not enough funds on your gift card!");
//            }
//        } else if (item.equals("Blanket")) {
//            if (price <= 100) {
//                System.out.println("Thank you for your purchase!");
//                System.out.println("Your current balance is: " + currentBalance + "$");
//            } else {
//                System.out.println("Sorry, not enough funds on your gift card!");
//            }
//        } else if (item.equals("Pillow")) {
//            if (price <= 100) {
//                System.out.println("Thank you for your purchase!");
//                System.out.println("Your current balance is: " + currentBalance + "$");
//            } else {
//                System.out.println("Sorry, not enough funds on your gift card!");
//            }
//        } else {
//            System.out.println("Invalid item!");
//        }
        if (item.equals("Charger")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equals("Headphones")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equals("USB cable")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equals("Pants")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equals("Hat")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equals("Socks")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equals("Blanket")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equals("Pillow")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equals("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else {
            System.out.println("Invalid item!");
        }


    }


}
