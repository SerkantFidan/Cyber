package office_hour;

import java.util.Scanner;

public class Practice11_26_NestedIf {
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

       // System.out.println("YOU WANT FOOD OR NOT?");

          String mainOptions = "food";
          String secondaryOption = "meal";

        //System.out.println("YOU WANT MEAL OR SNACK?");



        if (mainOptions.equalsIgnoreCase("food")) {

            System.out.println("You have selected food");

            if (secondaryOption.equalsIgnoreCase("snack")) {

                System.out.println("You have selected snack");

            }else if (secondaryOption.equalsIgnoreCase("meal")) {

                System.out.println("You have selected meal");

            }else{
                System.out.println("NO SUCH FOOD  OPTION");
            }

        }

    }
}

