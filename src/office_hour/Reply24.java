package office_hour;
import java.util.Scanner;
public class Reply24 {
    public static void main(String[] args) {
        //Enter your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        System.out.println("Enter your email");
        String email = scan.next();

        System.out.println("Enter your street");
        String street = scan.nextLine();
        String street1 = scan.nextLine();

        System.out.println("Enter your city");
        String city = scan.next();

        System.out.println("Enter your state");
        String state = scan.next();

        System.out.println("Enter your zipcode");
        int zipcode = scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        String contacts = "work phone number-" + workPhoneNumber + ",personal phone number-" + personalPhoneNumber + ", email:" + email;
        String fullName = firstName + ", " + lastName;
        String address = street + "," + city + ", " + state + zipcode;

        System.out.println("Patient information");
        System.out.println("Full name:" + fullName);
        System.out.println("Address:" + address);
        System.out.println("Contacts:" + contacts);
        System.out.println("Age:" + age);
        System.out.println("Height:" + height);
        System.out.println("Weight:" + weight + "pounds");
        System.out.println("Married?:" + isMarried);
    }
}