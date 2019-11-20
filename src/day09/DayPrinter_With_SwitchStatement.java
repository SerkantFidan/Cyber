package day09;

public class DayPrinter_With_SwitchStatement {
    public static void main(String[] args) {
        int dayCode = 8 ;
        switch(dayCode){
            // 1 is the actual value you are checking
            // just like dayCode==1
            case 1 :
                System.out.println("Day is Monday");
                break;
            case 2 :
                System.out.println("Day is Sunday");
                break;
            case 3 :
                System.out.println("Day is Wednesday");
                break;
            case 4 :
                System.out.println("Day is Thursday");
                break;
            case 5 :
                System.out.println("Day is Friday");
                break;
            case 6 :
                System.out.println("Day is Saturday");
                break;
            case 7 :
                System.out.println("Day is Sunday");
                break;
            default: // default is optional like else
                System.out.println("Day is Unknown");
        }


//        if(dayCode == 1){
//            System.out.println("Day is Monday");
//        } else if(dayCode == 2) {
//            System.out.println("Day is Tuesday");
//        } else if(dayCode == 3) {
//            System.out.println("Day is Wednesday");
//        } else if(dayCode == 4) {
//            System.out.println("Day is Thursday");
//        } else if(dayCode == 5) {
//            System.out.println("Day is Friday");
//        } else if(dayCode == 6) {
//            System.out.println("Day is Saturday");
//        } else if(dayCode == 7) {
//            System.out.println("Day is Sunday");
//        }else {
//            System.out.println("Day is Unknown");
//        }












    }
}
