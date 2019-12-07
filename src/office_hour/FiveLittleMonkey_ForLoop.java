package office_hour;

public class FiveLittleMonkey_ForLoop {
    public static void main(String[] args) {

        int boyMonkeysCount = 3;
        int girlMonkeysCount = 2;

        for(int monkeysCount = 5; monkeysCount > 0; --monkeysCount){
            if(boyMonkeysCount >1) {
                System.out.println(monkeysCount + "- boy - bumped his head\n- No more monkeys jumping on the bed");
            }else if(boyMonkeysCount==1) {
                System.out.println(monkeysCount + "- boy - bumped his head");
            }
            --boyMonkeysCount;

            if(girlMonkeysCount >=1) {
                --monkeysCount;
                System.out.println(monkeysCount + "- girl - bumped his head\n- No more monkeys jumping on the bed");
                --girlMonkeysCount;
            }

        }
        System.out.println("- Put those monkeys right to bed");








    }
}
