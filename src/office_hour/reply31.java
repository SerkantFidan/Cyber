package office_hour;

import java.util.Scanner;

public class reply31 {
    public static void main(String[] args) {
        System.out.println("---------------");
        System.out.println("select an option:");
        System.out.println("1) option 1");
        System.out.println("2) option 2");
        System.out.println("3) option 3");
        System.out.println("---------------");

        Scanner s = new Scanner(System.in);


        //your code here
        int option = s.nextInt();


        if(option ==1){
            System.out.println("user selected 1");
        }
        else if(option ==2){
            System.out.println("user selected 2");
        }else if(option ==3){
            System.out.println("user selected 3");
        }
    }

}
