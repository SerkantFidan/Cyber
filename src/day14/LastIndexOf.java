package day14;

public class LastIndexOf {
    public static void main(String[] args) {
        String name = "Game of Java";
        // find out last location the letter a shows up
        System.out.println(name.lastIndexOf("a")); //---> 11
        // find out last location the character space shows up
        System.out.println(name.lastIndexOf(" "));// ----> 7
        //find out last location the letter Ga shows up
        System.out.println(name.lastIndexOf("Ga"));// ----> 0
        //find out last location the letter Kawa shows up
        System.out.println(name.lastIndexOf("Kawa"));// ----> -1


        if(name.indexOf("Kawa") > -1 ){
            System.out.println("KAWA FOUND!!!");
        }else{
            System.out.println("NO KAWA - NO PUMPKIN");
        }







    }
}
