package day15;

public class Exercise3 {
    public static void main(String[] args) {
        //              0123456789012345
        String movie = "Lord Of The Ring";
        String wordOf = movie.substring(5,7);
        System.out.println("wordOf = " + wordOf);
        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);
        String wordSecond = movie.substring(5);
        System.out.println("wordSecond = " + wordSecond);
        String secondWord = movie.substring(5,16);
        System.out.println("secondWord = " + secondWord);
        int startingPoint = movie.indexOf(" ")+1;
        System.out.println("startingPoint = " + startingPoint);
        int endingPoint = movie.length();
        System.out.println("endingPoint = " + endingPoint);
        String substringOfTheRing = movie.substring(5,16);
        System.out.println("substringOfTheRing = " + substringOfTheRing);
        int indexOfMovie = movie.indexOf("r");
        System.out.println("indexOfMovie = " + indexOfMovie);












    }
}
