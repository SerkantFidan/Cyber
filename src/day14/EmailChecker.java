package day14;

public class EmailChecker {
    public static void main(String[] args) {

//
//        create a variable called email
//
//        check for below conditions
//
//        if it does not contain character @  say invalid email
//        if it contain space say invalid email
//        if it endsWith @gmail.com  -->> print gmail
//        if it endsWith @yahoo.com  -->> print yahoo email
//        if it endsWith @mail.ru  -->> print russian email
        String email = "esrasgt@gmail.com";
        boolean notContainChar = email.contains("@");

        if(!email.contains("@")  || email.contains(" ")){
            System.out.println("Invalid email");
        }else if(email.endsWith("@gmail.com")){
            System.out.println("google mail");
        }else if(email.endsWith("@yahoo.com")){
            System.out.println("yahoo email");
        }else if(email.endsWith("@russian.com")){
            System.out.println("russian email");
        }












    }
}
