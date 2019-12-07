package office_hour;

import java.util.Scanner;

public class replt_87 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;

        for (int i = inhabitants; i >= 1 ; i/=2) {
            System.out.println("Day "+ day + " [" + i + "]");
            day++;

        }
        System.out.println("---- EXTINCT ----");














    }
}
