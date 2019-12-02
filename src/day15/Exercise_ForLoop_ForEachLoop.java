package day15;

public class Exercise_ForLoop_ForEachLoop {
    public static void main(String[] args) {
        int[] intArray = {0,1,2,3,4,5};
        String[] stringArray = {"I love JAVA", "Serra get out my Bedroom"};

        for(int item = 0; item<= intArray.length-1; item++ ){
            System.out.println(intArray[item]);
        }

        for(int item: intArray){
            System.out.println(item);
        }

        for(int a =0; a<=stringArray.length-1; a++){
            System.out.println(stringArray[a]);
        }

        for(String a: stringArray){
            System.out.println(a);
        }






    }
}
