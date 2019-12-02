package office_hour;

public class Practice_11_27_Empty_Blank {
    public static void main(String[] args) {
       String message = " I LOVE  JAVA   " ;
        System.out.println("message = <" + message + ">");
        //trim --->take out spaces at beginning and ending of a String object
        // IT DOES NOT TAKE OUT THE SPACE IN BETWEEN CHARACTERS !!!!!!!!

     System.out.println(message.length());
     System.out.println(message.indexOf("LOVE"));
     System.out.println(message.lastIndexOf(""));

        String messageTrimmed = message.trim();
        System.out.println("messageTrimmed = <" + messageTrimmed + ">");

        // isEmpty -----> check whether

        String emptySpaces = "           ";
        System.out.println("emptySpaces = <" + emptySpaces + ">");
        System.out.println("emptySpaces.isEmpty() = " + emptySpaces.isEmpty());

        String emptySpacesAfterTrimmed = emptySpaces.trim();
        System.out.println("emptySpacesAfterTrimmed length is = " + emptySpacesAfterTrimmed.length());
        System.out.println("emptySpacesAfterTrimmed is empty??? = " + emptySpacesAfterTrimmed.isEmpty());

       // empty parentheses means we don’t need external data---> length() , trim(), isEmpty(), isBlank() ....

        // isEmpty VS isBlank method from String class
        // isEmpty ---->> yourString.length()>0 false else it's true
        // isBlank ---->> if you have only other than white spaces, get true, else get false
        System.out.println("emptySpaces is blank or not??  " + emptySpaces.isBlank());


        // indexOf --->give you location of the String you are looking for inside anotherString
        // for example yourString.indexOf("abc")
        // copied from above so we can see what we have --->>
         //String message = "  I LOVE  JAVA   ";
        System.out.println(message);

        int locationOfLove = message.indexOf("LOVE");
        System.out.println("locationOfLove = " + locationOfLove);
        // lastIndexOf ---> give you last location










    }
}
