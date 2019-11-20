package day04;
import java.util.Scanner;
public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter fahrenheit");
        double fahrenheit = scan.nextDouble();
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(fahrenheit + "F equals to " + celcius + "C.");
    }
}
