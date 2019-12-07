package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {
//        String name = "Gokyuzum";
//        int charCount = name.length();
//        int lastCharIndex = charCount - 1;
//
//
//        // my condition is x<=charCount-2  or  x<= lastCharIndex-1
//
//        for (int x = 0; x <= lastCharIndex - 1; x += 2) {
//
//            System.out.println(name.substring(x, x + 2));
//
//        }

        String name ="Ayra";
        int charCount = name.length();
        int lastCharIndex = charCount - 1;

        for (int i = 0; i <= lastCharIndex - 1 ; i++) {
            System.out.println(name.substring(i, i + 2));

        }
        for (int i = 0; i <= lastCharIndex - 2; i++) {
            System.out.println(name.substring(i, i + 3));

        }
















    }
}
