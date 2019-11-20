package day09;

import java.util.Scanner;

public class InitializingAVariable {
    public static void main(String[] args) {
       // int num ;
        // a variable inside a method, must get initial value
        // before it's belong used for the first time
        //and there should not be any chance
        // this vaiable does not get value before usage
        //System.out.println(num);
        //String name = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Select a number");
        int languageOption = scan.nextInt();
        String greeting = "";
        if(languageOption == 1){
            greeting = "Hello, SDET";
        }else if(languageOption == 2){
            greeting = "Salam, SDET";
        }else if(languageOption == 3){
            greeting = "Hola, SDET";
        }else if(languageOption == 4){
            greeting = "Privet, SDET";
        }else if(languageOption == 5){
            greeting = "Merhaba, SDET";
        }else if(languageOption == 6){
            greeting = "Szia, SDET";
        }else if(languageOption == 7) {
            greeting = "Bonjour, SDET";
        }

        System.out.println(greeting);



    }
}
