package day15;

public class Exercise2 {
    public static void main(String[] args) {
        String name = "Esra Fidan";
        System.out.println(name.length());
        System.out.println(name.charAt(0) + " " + name.charAt(1) + " " + name.charAt(2) + " " + name.charAt(3) +
                "  " + name.charAt(5) + " " + name.charAt(6) + " " + name.charAt(7) + " " + name.charAt(8) + " " + name.charAt(9));

        System.out.println(name.charAt(9) + " " + name.charAt(8) + " " + name.charAt(7) + " " + name.charAt(6) +
                " " + name.charAt(5) + "  " + name.charAt(3) + " " + name.charAt(2) + " " + name.charAt(1) + " " + name.charAt(0));

        String myName = "Esra";
        int lengthMyName = myName.length();
        System.out.println(lengthMyName);
        int lastCharIndex = myName.length()- 1;
        System.out.println(lastCharIndex);
        char lastChar = myName.charAt(lastCharIndex);
        System.out.println(lastChar);
        System.out.println(myName.charAt(3));
        System.out.println(myName.charAt(myName.length()- 1));









    }
}
