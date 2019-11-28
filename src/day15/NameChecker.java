package day15;

public class NameChecker {
    public static void main(String[] args) {
        String yourName = "Esra";

                if(yourName.length() < 4){
                    System.out.println("Short Name");
                }else if(yourName.length() >=4 && yourName.length() <=11){
                    System.out.println("Medium Name");
                }else if(yourName.length() > 11 ) {
                    System.out.println("Longer Name");
                }
//=====================================================================================
                if(yourName.contains("a") ||yourName.contains("e") ){
                    System.out.println("Name contains a or e");
                }else{
                    System.out.println("I don't have both a or e in my name");
                }




    }



}
