package office_hour;

public class FiveLittleMonkeys_WhileLoop {
    public static void main(String[] args) {
//        Try it out using
//        while loop | do while loop |  for loop
//        in 3 different classes
//
//        Legend of 5 little monkeys:
//​
//        Pay closer attention to this actual Lyrics
//        There are 3 boy monkeys and 2 girl monkeys
//        the order monkeys fall down is
//        5 - boy - bumped his head
//        - No more monkeys jumping on the bed
//​
//        4 - girl - bumped her head
//        - No more monkeys jumping on the bed
//​
//        3 - boy - bumped his head
//        - No more monkeys jumping on the bed
//​
//        2 - girl - bumped her head
//        - No more monkeys jumping on the bed
//​
//        When there is only one monkey the Lyrics change
//        1 little monkey(not monkeys)
//        1 - boy - bumped his head
//        - Put those monkeys right to bed
//​
//        -------------------
//                Lyrics
//        5 little monkeys jumping on the bed
//        One fell off and bumped his head
//        Mama called the doctor
//        And the doctor said
//        No more monkeys jumping on the bed
//​
//        4 little monkeys jumping on the bed
//        One fell off and bumped her head
//        Mama called the doctor
//        And the doctor said,
//        No more monkeys jumping on the bed
//​
//        3 little monkeys jumping on the bed
//        One fell off and bumped his head
//        Mama called the doctor
//        And the doctor said,
//        No more monkeys jumping on the bed
//​
//        2 little monkeys jumping on the bed
//        One fell off and bumped her head
//        Mama called the doctor
//        And the doctor said,
//        No more monkeys jumping on the bed
//​
//        1 little monkey jumping on the bed
//        One fell off and bumped his head
//        Mama called the doctor
//        And the doctor said,
//        Put those monkeys right to bed
        int boyMonkeysCount = 3;
        int girlMonkeysCount = 2;
        int monkeysCount = boyMonkeysCount + girlMonkeysCount;

        while(monkeysCount > 0){
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
        }
        System.out.println("- Put those monkeys right to bed");







    }
}
