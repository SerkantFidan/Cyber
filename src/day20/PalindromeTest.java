package day20;

public class PalindromeTest {
    public static void main(String[] args) {
        // if you reverse a String it does not change it means
        // the String is called Palindrome
        // level, kayak, hannah, madam, elle, aziza

        String name = "Esra Fidan";
        System.out.println("name = " + name);
        
        String reversedName = "";

        for (int x = name.length()-1; x >= 0 ; x--) {
            reversedName += name.charAt(x);

        }
        System.out.println("reversedName = " + reversedName);
        
        // MAKE THIS CODE DOES NOT CARE ABOUT SPACES WHILE CHECKING
        // Check whether reversed name is equal without case checking
        String replaceName = name.replace(" ","");
        System.out.println("replaceName = " + replaceName);
        String replaceReversedName = name.replace(" ","");
        System.out.println("replaceReversedName = " + replaceReversedName);
        

        if(name.equalsIgnoreCase(reversedName)){
            
            System.out.println("PALINDROME TEST HAS PASSED");
            
        }else {
            
            System.out.println("PALINDROME TEST HAS FAILED");
        }









    }
}
