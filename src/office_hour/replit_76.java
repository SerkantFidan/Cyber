package office_hour;

import java.util.Scanner;

public class replit_76 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();


        if(email.contains("_")){
            int lastIndexEmail = email.length()-1;
            int indexOfUnderscore = email.indexOf("_");
            int indexOf = email.indexOf("@");

            String newEmail = email.substring( email.indexOf("_")+1, email.indexOf("@"))
                    +"_" +email.substring(0,email.indexOf("_") )+ email.substring(email.indexOf("@"));

            System.out.println(newEmail);
        }else{
            System.out.println(email);
        }
    }
}
