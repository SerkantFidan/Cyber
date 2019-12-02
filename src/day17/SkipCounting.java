package day17;

public class SkipCounting {
    public static void main(String[] args) {
        // Skip counting by 3 from 0 till 30
        // 3 6 9 12 15 18 21 24 27 30

//        int counter = 0;
//        while(counter <= 30){
//            System.out.print(counter + " ");
//            counter += 3;
//        }

//        int counter = 0;
//        while(counter < 30){
//            counter += 3;
//            System.out.print(counter + " ");
//
//        }

        // write a program to print out an even number from 0 to 50;
        // write a program to print out an odd number from 0 to 50;

        int number = 0;
        while(number <= 50){

            System.out.print(number + " ");
            number+=2;
        }

        System.out.println("------------------------------");

        int number2 = 1;
        while(number2 <= 50){
            System.out.print(number2 + " ");
            number2+=2;
        }

        System.out.println("------------------------------");
        int cnt3 = 0;

        while(cnt3 <= 50){
            if(cnt3 % 2 == 0){
                System.out.println(cnt3 + " is even number");
            }else{
                System.out.println(cnt3 + " is odd number");
            }
            cnt3++;
        }













    }
}
