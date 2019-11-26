package day12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = scan.nextInt();
        if(num % 5 == 0 && num % 3 == 0){
            System.out.println("It's FizzBuzz Number");
        }else if(num % 5 == 0){
            System.out.println("It's Fizz Number");
        }else if(num % 3 ==0) {
            System.out.println("It's Buzz Number");
        }else {
            System.out.println("NOT MY NUMBER");
        }






    }
}
