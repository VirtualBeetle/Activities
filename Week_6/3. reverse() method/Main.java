import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of users:");
        int n = sc.nextInt();

        List<User> userList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of User " + (i+1));
            String[] details = sc.next().split(",");
            User user = new User(details[0], details[1], details[2], details[3]);
            userList.add(user);
        }

        Collections.sort(userList, Collections.reverseOrder());

        System.out.println("The user details in reverse order:");
        System.out.println("Name           Mobile number");

        for (User user : userList) {
            System.out.println(user);
        }
    }
}
