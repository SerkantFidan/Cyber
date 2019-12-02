package day15;


public class exercise {
    public static void main(String[] args) {

        String emptySpaces = "           ";
        System.out.println(emptySpaces.isEmpty()); // ---> false
        System.out.println(emptySpaces.isBlank()); // ---> true

        String name = "Serra Fidan";
        System.out.println(name.contains("Id"));

        String upperCaseName = name.toUpperCase();
        System.out.println(upperCaseName);

        System.out.println(upperCaseName.contains("Id"));
        String lowerCaseName = name.toLowerCase();

        System.out.println(lowerCaseName);
        System.out.println(lowerCaseName.contains("Id"));

        System.out.println(name.toUpperCase().contains("ID"));
        System.out.println(name.toLowerCase().contains("id"));






    }

}
