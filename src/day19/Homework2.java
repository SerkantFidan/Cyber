package day19;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int start = scan.nextInt();
        int end = scan.nextInt();

        int sum = 0;
        int counter = 0;

        for (int i = start; i <= end ; i++) {
            System.out.print(i+ " ");

            sum += i;

            counter+=1;

        }
        System.out.println();
       // System.out.println(sum);
          System.out.println("sum = " + sum);
          System.out.println("counter = " + counter);










    }
}
