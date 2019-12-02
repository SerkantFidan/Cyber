package day16;

public class Task_1 {
    public static void main(String[] args) {

        String word1= "Java";
        String word2= "";
      // in order to reverse a word, we need to take last character and put in first character
      // then put the second character at 1 location before first character
      // start getting character from last location till first location then save it
        word2 = "" + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
        word2 = word2 + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
        word2 +=  word1.charAt(3) + "" + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
        //
        System.out.println("word2= " + word2);


        // I want to add world at the end of it
        String msg = "Hello ";
        //msg = msg + "World!" ;
        msg += "World!";
        System.out.println("msg = " + msg);
















//        System.out.println(word1.charAt(3) + "" + word1.charAt(2) + ""+ word1.charAt(1) + "" + word1.charAt(0));
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a word with 4 characters");
//        String word1 = scan.next();
//        int lastIndexOfword1 = word1.length()-1;
//        System.out.println(lastIndexOfword1);
//        String word2 = word1.charAt(3) + "" + word1.charAt(2) + ""+ word1.charAt(1) + "" + word1.charAt(0);
//        //System.out.println(word1.length());
//        System.out.println(word1 + " --> " +word2);












    }
}
