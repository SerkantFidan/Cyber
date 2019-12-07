package office_hour;

public class FiveLittleMonkeys_DoWhileLoop {
    public static void main(String[] args) {
        int boyMonkeysCount = 3;
        int girlMonkeysCount = 2;
        int monkeysCount = boyMonkeysCount + girlMonkeysCount;

//        while(monkeysCount > 0){
//            if(boyMonkeysCount >1) {
//                System.out.println(monkeysCount + "- boy - bumped his head\n- No more monkeys jumping on the bed");
//            }else if(boyMonkeysCount==1) {
//                System.out.println(monkeysCount + "- boy - bumped his head");
//            }
//            --boyMonkeysCount;
//            --monkeysCount;
//            if(girlMonkeysCount >=1) {
//                System.out.println(monkeysCount + "- girl - bumped his head\n- No more monkeys jumping on the bed");
//                --girlMonkeysCount;
//            }
//            --monkeysCount;
//        }
//        System.out.println("- Put those monkeys right to bed");

        do{
            if(boyMonkeysCount >1) {
                System.out.println(monkeysCount + "- boy - bumped his head\n- No more monkeys jumping on the bed");
            }else if(boyMonkeysCount==1) {
                System.out.println(monkeysCount + "- boy - bumped his head");
            }
            --boyMonkeysCount;
            --monkeysCount;

            if(girlMonkeysCount >=1) {
               System.out.println(monkeysCount + "- girl - bumped his head\n- No more monkeys jumping on the bed");
               --girlMonkeysCount;
           }
           --monkeysCount;
        }while(monkeysCount > 0);
        System.out.println("- Put those monkeys right to bed");













    }
}
