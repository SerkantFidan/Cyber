package day08.day08;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        /*
         * Voting Eligibility Program
         *
         * Create a variable called age as int
         * check whether this age is more than or equal to 18
         *  if yes print : you are ready to vote !!!
         *  if it's less 18 print  wait until you are 18
         *
         * */
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int voteEligibilityAge = scan.nextInt();
        if (voteEligibilityAge >= 18) {
            System.out.println("You are ready to vote!!!");
        }else {
            System.out.println("Wait until you are 18");
        }




    }

}
