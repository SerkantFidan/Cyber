package office_hour;

import java.util.Scanner;

public class ExerciseIf {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//
//        if (a > b){
//            System.out.println(a + " is greater");
//        }else {
//            System.out.println(b + " is greater");
//        }
        Scanner scanner = new Scanner(System.in);
        //Step 2. Create and intitialize in variable day. Use scanner.nextInt() to intitialize.
        int day = scanner.nextInt();
        //Step 3. Write an if statement
        if (day == 1){
            System.out.println("It's a Monday!");
        }else if(day == 2){
            System.out.println("It's a Tuesday!");
        }else if(day == 3){
            System.out.println("It's a Wednesday!");
        }else if(day == 4){
            System.out.println("It's a Thursday!");
        }else if(day == 5){
            System.out.println("It's a Friday!");
        }else if(day == 6){
            System.out.println("It's a Saturday!");
        }else if(day == 7){
            System.out.println("It's a Sunday!");
        }else {
            System.out.println("There is no such a day!");
        }

    }
}
