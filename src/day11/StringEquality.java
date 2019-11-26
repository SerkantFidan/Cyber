package day11;

public class StringEquality {
    public static void main(String[] args) {
//        A blueprint is a guide for making something — it's a design or pattern that can be followed. Want to build the best tree house ever? Draw up a blueprint and follow the design carefully. The literal meaning of a blueprint is a paper — which is blue — with plans for a building printed on it.

   String name = "Rabia"; // String literal

   String name2 = new String("Rabia");

   String name3 = "Rabia";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println("USING EQUALS METHODS");
        System.out.println(name == name2);
        System.out.println(name == name3);

        // The correct way of comparing String to get consistent result is
        // using one of the String object behaviour / method called
        // equals method
        // str1.equals(str2)
        //

        System.out.println("USING EQUALS METHODS");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));

// BOTTOM LINE IS : DO NOT EVER USE == TO CHECK STRING EQUALITY








    }
}
