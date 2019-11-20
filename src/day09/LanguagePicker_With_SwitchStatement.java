package day09;

public class LanguagePicker_With_SwitchStatement {
    public static void main(String[] args) {

        System.out.println("Welcome to Cybertek Call Center");
        System.out.println("Please select your language option from 1-7");

        int languageOption = 5;
        String greeting = "";

        switch (languageOption) {
            case 1:
                greeting = "Salam";
                break;
            case 2:
                greeting = "Hello";
                break;
            case 3:
                greeting = "Privet";
                break;
            case 4:
                greeting = "Szia";
                break;
            case 5:
                greeting = "Merhaba";
                break;
            case 6:
                greeting = "Hola";
                break;
            case 7:
                greeting = "Bonjour";
                break;
            default:
                greeting = "Unknown";
        }
        System.out.println(greeting + " SDET");
    }
}