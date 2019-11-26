package day11;

import java.util.Scanner;

public class ScoreChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter score");
        int score = scan.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("INVALID SCORE");
        } else if (score == 100) {
            System.out.println("PERFECT SCORE");
        } else if (score >= 70 && score < 100) {
            System.out.println("YOU HAVE PASSED");
        } else if (score < 20) {
            System.out.println("Come to my office");
        } else if (score > 30 && score < 40) {
            System.out.println("Attend additional classes");
        } else if (score > 40 && score < 70) {
            System.out.println("Little bit more study will let you pass");
        } else {
            System.out.println("YOU HAVE FAILED");
        }

        // SCORE = 10000
//   score>70 || score <100

/*
* Create a program to check the score   : ScoreChecker with main method
   Create a variable called score assign a value of your choice
	 if the score is less than 0 or more than 100  —>> INVALID SCORE!!!!
      If the score is  100 —>> PERFECT SOCRE
      If the score is between 70-100  —>> YOU HAVE PASSED !
      Else you have failed !!!!!
	OPTIONAL :  add more condition for failing scores
    If the score is less than 20  —>. Come to my office
    If the score is between 30-40  —>. Attend additional classes
    If the score is between 40-70  —>. Little bit more study will let you pass
* */


    }
}
