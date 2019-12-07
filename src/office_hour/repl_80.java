package office_hour;

import day18.ForLoopIntro;

import java.util.Scanner;

public class repl_80 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        char startAsChar = start.charAt(0);
        char endAsChar = end.charAt(0);

        for (char iChar = startAsChar; iChar <= endAsChar ; iChar++) {
            System.out.println(iChar);

        }













    }
}
