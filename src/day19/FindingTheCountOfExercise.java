package day19;

public class FindingTheCountOfExercise {
    public static void main(String[] args) {

        String name ="Serra Fidan";
        // name.charAt(x) == 'r';
        int counter = 0;
        for (int x = 0; x < name.length() ; x++) {
            char current = name.charAt(x);
            System.out.println(current);

            if(current == 'r'){
                System.out.println("BINGO FOUND IT!!!!");
                counter+=1;
            }
        }








    }
}
