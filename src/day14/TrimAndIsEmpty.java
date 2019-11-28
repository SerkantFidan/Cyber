package day14;

public class TrimAndIsEmpty {
    public static void main(String[] args) {
       // String message = "    REPL IS COMING ! ";

       // System.out.println(message);
       // System.out.println("message character count is " + message.length());
        // trim method is used to take out spaces on two sides
        // not in between!!!!!
        //message = message.trim();
        //System.out.println(message);

        //System.out.println(    message.trim()   );

        //System.out.println("message character count is " + message.length());

        //System.out.println(message.isEmpty());

      String name = "    serra     ";
        //System.out.println(name.substring(3,5));
        System.out.println(name);
        System.out.println(name.length());

       name= name.trim();
        System.out.println(name);
        System.out.println(name.length());

        String name2 = name.replace("kant", "ra");
        System.out.println(name2);


        String name3 = name.replace("r","KK");
        System.out.println(name3);






    }
}
