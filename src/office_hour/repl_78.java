package office_hour;

import java.util.Scanner;

public class repl_78 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;



        int SenderFirstIndex = message.indexOf("<");
        int SenderLastIndex = message.lastIndexOf(">");
        sender = message.substring(SenderFirstIndex+1,SenderLastIndex);


        int phoneNumberFirstIndex = message.indexOf("[");
        int phoneNumberLastIndex = message.lastIndexOf("]");
        phoneNumber = message.substring(phoneNumberFirstIndex+1,phoneNumberLastIndex);


        int messageBodyFirstIndex = message.indexOf("{");
        int messageBodyLastIndex = message.lastIndexOf("}");
        messageBody = message.substring(messageBodyFirstIndex+1,messageBodyLastIndex);

        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+ phoneNumber);
        System.out.println("Message body:  "+messageBody );



    }
}
