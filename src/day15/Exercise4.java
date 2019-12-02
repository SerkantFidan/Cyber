package day15;

public class Exercise4 {
    public static void main(String[] args) {
        //              0123456789012345
        String movie = "Lord Of The Ring";
        String movie2 = "Ring Of The Java Lord";
        // reverse Lord Of The Ring --->> Ring Of The Lord
        // reverse Lord Of The Ring --->> Ring Of The Java Lord
        String reverseMovie = movie.substring(12) + movie.substring(4,12) + movie.substring(0,4);
        System.out.println("reverseMovie = " + reverseMovie);
        String reverseMovie2 = movie.substring(12) + movie.substring(4,12) + "Java " + movie.substring(0,4);
        System.out.println("reverseMovie2 = " + reverseMovie2);

        String replaceMovie = movie2.replace("Java", ""); //---->> "" ----> empty String
        System.out.println("replaceMovie = " + replaceMovie);
       System.out.println(movie2.replace(" ",""));

        // "Happy Thanks Giving to All!!" --->> "Happy Thanksgiving to All!!
        String message = "Happy Thanks Giving to All!!";
        System.out.println(message.replace("Thanks Giving","Thanksgiving"));

        String message3 = "TOMORROW IS OFF NO!";
        System.out.println(message3.replace(" NO", ""));













    }
}
