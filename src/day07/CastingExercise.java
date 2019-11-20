package day07;

public class CastingExercise {
    public static void main(String[] args) {
        // create a long variable and store int
        long earthToMoon = 10000; // -----> 10000L
        //create an int variable and try to store above long value
        int earthToMoonIn_blabla = (int) earthToMoon;
        System.out.println(earthToMoonIn_blabla);
    }
}
