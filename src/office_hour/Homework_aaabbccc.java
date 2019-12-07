package office_hour;

public class Homework_aaabbccc {
    public static void main(String[] args) {

        String str = "aaabbccc" ;
        String uniqueStr = "" ;

        for (int i = 0; i < str.length(); i++) {

            String eachChar = str.substring(i, i+1);
           //System.out.print(eachChar);

           if(!uniqueStr.contains(eachChar)){
               uniqueStr+= eachChar;
               //System.out.println(eachChar);
           }


        }
        System.out.println(uniqueStr);
















    }
}
