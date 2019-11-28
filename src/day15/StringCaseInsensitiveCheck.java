package day15;

public class StringCaseInsensitiveCheck {
    public static void main(String[] args) {
        String name = "Arya Stark";
        System.out.println("name.contains( \"st\") RESULT is: " + name.contains("st"));

        // I wanna check whether this name contains st no matter the case
        // so I want to store the uppercase version of this name then check for ST

        String uppercaseName = name.toUpperCase(); // "ARYA STARK"
        System.out.println("NAME contains ST or not? " + uppercaseName.contains("ST"));

        String lowerCaseName = name.toLowerCase(); // "arya stark"
        System.out.println("lowerCaseName contains st or not ?= " + lowerCaseName.contains("st"));

        // this is called methos chaining, combining multiple method call
        // make my name all lowercase then check whether it contains lowercase st

                          //String--------->contains   THIS WORK BECAUSE name.toLowerCase() result in another String Object
        System.out.println(name.toLowerCase().contains("st"));
       // System.out.println(name.length().toUppercase());
                             // int------->toUpperCase ------> BAD IDEA!!!!!












    }
}
