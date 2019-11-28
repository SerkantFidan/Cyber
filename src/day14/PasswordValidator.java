package day14;

public class PasswordValidator {
    public static void main(String[] args) {

        // PASSWORD VALIDATOR
        // MINIMUM 8 CHAR MAX 16 CHAR
        // IT MUST CONTAIN _ OR $
        // IT MUST NOT CONTAINS SPACE
        // IT MUST START Ab

        //if any of above condition does not match say INALID PASSWORD
        // else say GOOD PASSWORD !
        String password = "Ab_H2729$gfgdsu";
        // MINIMUM 8 CHAR MAX 16 CHAR
        // password.length() >=8 && password.length() <= 16
        boolean min8max16 = password.length() >= 8 && password.length() <= 16 ;

        // IT MUST CONTAINS _ OR $
        // password.contains("_") || password.contains("$")
        boolean mustContains_or$ = password.contains("_") || password.contains("$");

        // IT MUST NOT CONTAINS SPACE
        // ! password.contains(" ")
        boolean C = !password.contains(" ");

        // IT MUST START Ab
        // password.startsWith("Ab")
        boolean mustStartsWithAb = password.startsWith("Ab");

        if(min8max16 && mustContains_or$ && !password.contains(" ") && password.startsWith("Ab")){
            System.out.println("VALID PASSWORD");
        }else{
            System.out.println("INVALID PASSWORD");
        }









    }
}
