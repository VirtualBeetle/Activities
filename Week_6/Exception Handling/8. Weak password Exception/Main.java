import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Obtain user details from input
        System.out.println("Enter the user details");
        
        String details[]=sc.nextLine().split(",");
        String name = details[0];
        String mobile =  details[1];
        String username =  details[2];
        String password =  details[3];

        // Create a User object and set its attributes
        User user = new User(name, mobile, username, password);

        try {
            // Validate the user's password using UserBO.validate() method
            UserBO.validate(user);
            // If password is valid, display user details
            System.out.println(user);
        } catch (WeakPasswordException e) {
            // Handle WeakPasswordException by displaying error message
            System.out.println(e);
        }
    }
}
