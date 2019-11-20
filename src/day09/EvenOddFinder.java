package day09;

import java.util.Scanner;

public class EvenOddFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        if(num % 2 == 0){
            System.out.println("This is a even number");
        }else if(num % 2 == 1){
            System.out.println("This is a odd number");
        }



    }
}
