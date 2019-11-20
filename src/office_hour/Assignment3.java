package office_hour;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
//        String lan1 = scan.nextLine();
//        String lan2 = scan.nextLine();
//        System.out.println("I will learn \"Java\" + and \"SQL\" at CybertekSchool.");

        int areaCode = scan.nextInt();
        int localCode = scan.nextInt();

        String phoneNumber = "(" + areaCode + ")" + "-" + localCode;
        System.out.println("Calling number "+ phoneNumber);
    }
}
