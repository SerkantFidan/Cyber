package day10;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myAnswer ="";
        int myNumber = scan.nextInt();
        if( myNumber%5== 0){
            myAnswer ="Fizz Number";
        }else{
            myAnswer = " not a Fizz Number";
        }
        System.out.println("my number is " + myNumber + myAnswer);





    }
}
