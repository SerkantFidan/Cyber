package day12;

import java.util.Scanner;

public class WarmUp_SeasonFinder {
    public static void main(String[] args) {
        //  Wake up Task 2
//    Create a class called WarmUp_SeasonFinder :
//
//        Create a variable called month with data type int
//        And write an if else if else statement to do following
//
//        If the month is less than 1 or more than 12 —>> INVALID MONTH
//        If the month is between 3-5  print it’s  spring
//        If the month is between 6-8  print it’s  summer
//        If the month is between 9-11  print it’s  fall
//        If the month is 12,1,2  print its  Winter!
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int month = scan.nextInt();
        if(month<1 || month>12){
            System.out.println("INVALID MONTH");
        }else if(month >= 3 && month <= 5){
            System.out.println("It's spring");
        }else if(month >= 6 && month <= 8) {
            System.out.println("It's summer");
        }else if(month >= 9 && month <= 11) {
            System.out.println("It's fall");
        }else if(month ==12 || month ==1 || month ==2){
            System.out.println("It's winter!");
        }
// since first condition is already taking out invalid situations,
// we do not need else in this code
// else in general is optional






    }
}
