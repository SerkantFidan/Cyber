package day09;

public class LanguagePicker {
    public static void main(String[] args) {
        System.out.println("Welcome to Cybertek Call Center");
        System.out.println("Please select your language option from 1-7");

        int languageOption = 8;
        String greeting ="";
        if(languageOption == 1){
            greeting = "Hello";
        }else if(languageOption == 2){
            greeting = "Salam";
        }else if(languageOption == 3){
            greeting = "Hola";
        }else if(languageOption == 4){
            greeting = "Privet";
        }else if(languageOption == 5){
            greeting = "Merhaba";
        }else if(languageOption == 6){
            greeting = "Szia";
        }else if(languageOption == 7) {
            greeting = "Bonjour";
        }else
            greeting = "Unknown";
        System.out.println(greeting + ", SDET");
        // Hello, SDET
        //greeting = greeting + ", SDET" ;

    }
}
