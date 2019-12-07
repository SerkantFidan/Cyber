package office_hour;

public class replt_88deneme {
    public static void main(String[] args) {
        String name = "catdog";
        int charCount = name.length();

        // cat  0,1,2
        // dog  3,4,5

  //      int x = 0;
  //      System.out.println(name.substring(0,3));
  //      x = x + 3;
   //     System.out.println(name.substring(3,6));

        for (int x = 0; x <= name.length()-3 ; x+=3) {
            System.out.println(name.substring(x,x+3));

        }














    }
}
