package day12;

public class LoginTest {
    public static void main(String[] args) {
        // we can declare and assign value like this
        // if it's multiple variables of same type
        String userName = "abc" , password= "efg";
        // user123, pass123

//    String str = “abc” ;
//        str.equals(“abc”) —> true       ! str.equals(“abc”) —>> false
//
//        Create class called LoginTest with main method
//        Create 2 String variable called userName , password
//        and do following
//        // your correct username password is  user123  and pass123
//        Check if your username and password correct
//        If so print login successful
//
//        If not
//        Check whether your username correct
//        if not print  , username is not correct
//        Check your password is correct or not
//        If not print, password is not correct

        if(userName.equals("user123") && password.equals("pass123")){
            System.out.println("Login successful");
        }else if(! userName.equals("user123") && password.equals("pass123") ){
            System.out.println("USERNAME NOT CORRECT!!!");
        }else if(userName.equals("user123") && ! password.equals("pass123") ){
            System.out.println("PASSWORD NOT CORRECT!!!");
        }else{
            System.out.println("USERNAME AND PASSWORD ARE BOTH WRONG!!!!");
        }







    }
}
