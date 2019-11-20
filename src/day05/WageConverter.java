package day05;

import java.util.Scanner;

public class WageConverter {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("How many your hourly wage?");

        int wageInHour = scan.nextInt();

        int salary = 2080*wageInHour;

        System.out.println("Your yearly salary based on the hourly wage rate of " + wageInHour + "$ is equal to " + salary + "$ per year");







    }


}
