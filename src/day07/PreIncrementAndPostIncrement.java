package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {
        int apple = 8;
        apple++ ; // incrementing by one  --->9
       // System.out.println(apple); // 9  //printing the increased value

       // System.out.println(++apple); // increasing the value and print the value

        //apple++ , when ++ comes after the variable
        // it's called post increment
        // it will increase the value
        // BUT it will reflect the increased the value next time the variable show up!!
        //System.out.println(apple++);
        //System.out.println(apple);

        int score = 50;
        System.out.println(++score); //51
        System.out.println(score++); // 51 and ready to be 52 next time it
        System.out.println(score); //52
        System.out.println(--score); //51
        System.out.println(score--);// still 51
        System.out.println(score);//50









    }
}
