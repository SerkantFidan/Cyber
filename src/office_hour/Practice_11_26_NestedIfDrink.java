package office_hour;

import java.util.Scanner;

public class Practice_11_26_NestedIfDrink {
    public static void main(String[] args) {
         /*
        * pseudo code :
        you have option to buy food or drink
        under food you can buy meal or snack
        under the drink you can buy soda or juice
        IF YOUR SELECTION IS FOOD
             WHAT KIND DO YOU WANT ? MEAL OR SNACK
        IF  YOUR SELECTION IS DRINK
            WHAT KIND DO YOU WANT ? SODA OR JUICE
            *
            * TRY OUT THE DRINK OPTION ON YOUR OWN
        * */
         Scanner scan = new Scanner(System.in);
        System.out.println("Do you want food or drink? ");
        System.out.println("If your answer is food you want meal or snack? ");
        System.out.println("If your answer is drink you want soda or juice? ");
        String mainOption= scan.next();
        String secondaryOption = scan.next();

        if(mainOption.equalsIgnoreCase("food")){
            System.out.println("You have selected food");
            if(secondaryOption.equalsIgnoreCase("meal")){
                System.out.println("You have selected meal");
            }else if (secondaryOption.equalsIgnoreCase("snack")) {
                System.out.println("You have selected snack");
            }else if(mainOption.equalsIgnoreCase("drink")){
                System.out.println("You have selected drink");
            }else if(secondaryOption.equalsIgnoreCase("soda")) {
                System.out.println("You have selected soda");
            }else if(secondaryOption.equalsIgnoreCase("juice")) {
                System.out.println("You have selected juice");

            }

                }





















    }
}
