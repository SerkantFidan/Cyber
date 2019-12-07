package office_hour;

import java.util.Scanner;

public class replit_78 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sender");
        System.out.println("Enter phone number");
        System.out.println("Enter messageBody");
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        sender = "Sender:<"+ firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase() + " " +
                lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase()+">.";

        phoneNumber = scan.nextLine();
        int fistDashPhoneNumber = phoneNumber.indexOf("-");
        int lastDashPhoneNumber = phoneNumber.lastIndexOf("-");
        phoneNumber = "From Number:["+phoneNumber.substring(0,fistDashPhoneNumber)+
                phoneNumber.substring(fistDashPhoneNumber,lastDashPhoneNumber)+phoneNumber.substring(lastDashPhoneNumber)+"].";

        messageBody = scan.nextLine();
        int messageFirstSpaceIndex = messageBody.indexOf(" ");
        messageBody = "Message:{"+messageBody.substring(0,1).toUpperCase()+messageBody.substring(messageFirstSpaceIndex).toLowerCase()+"}";

        message = sender + " "+phoneNumber+" "+messageBody;
        System.out.println(message);



//        We have a message variable already declared and assigned value in this format
//
//        Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
//
//        Variables are already declared:
//
//        sender, phoneNumber, messageBody
//                - by using String methods:
//        retrieve related information from SMSmessage string and assign to those 3 variables.
//                -print each variable in separate line
//
//        Sender: Mike Smith
//        Phone Number: 202-123-3456
//        Message body: I love programing and problem solving








    }
}
