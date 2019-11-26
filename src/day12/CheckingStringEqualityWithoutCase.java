package day12;

public class CheckingStringEqualityWithoutCase {
    public static void main(String[] args) {

        String userName = "aBc123";
        boolean userNameCorrect = userName.equals("ABC123");
        System.out.println(userNameCorrect);

        boolean nameCheckIgnoreCase = userName.equalsIgnoreCase("ABC123");
        System.out.println(nameCheckIgnoreCase);

//        String name = "esra";
//        String name2 ="ESRA";
//        boolean name2Correct  = name.equals(name2);
//        System.out.println(name2Correct);
//
//        boolean nameCheckCorrectIgnoreCase = name.equalsIgnoreCase(name2);
//        System.out.println(nameCheckCorrectIgnoreCase);

        String name = "Esra";
        // I want to store the result of checking name into a variable
        boolean nameEqualsWithoutCase = name.equalsIgnoreCase("esra");
        System.out.println("Does this name has same character without caring about the case");
        System.out.println(nameEqualsWithoutCase);

        System.out.println(name.equalsIgnoreCase("eSrA"));







    }
}
