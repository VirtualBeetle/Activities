import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of users:");
        int n = scanner.nextInt();

        // Create a Set of user objects from user input
        Set<User> userSet = new HashSet<>();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of user" + (i + 1));
            System.out.println("Username:");
            String username = scanner.nextLine();
            System.out.println("Bank name:");
            String bankname = scanner.nextLine();
            User user = new User(username, bankname);
            userSet.add(user);
        }

        // Create a List of user objects from input in CSV format with null values in bankName
        System.out.println("Enter username(Expire in one month) seperated by comma");
        String[] usernames = scanner.nextLine().split(",");
        List<User> userList = new ArrayList<>();
        for (String username : usernames) {
            userList.add(new User(username, null));
        }

        // Remove elements from userSet that are not present in userList
        userSet.retainAll(userList);

        // Sort userSet in alphabetical order of username
        SortedSet<User> sortedSet = new TreeSet<>(userSet);

        // Display the users going to expire within a month
        System.out.println("Users going to expire within a month");
        int i = 1;
        for (User user : sortedSet) {
            System.out.println("User " + i);
            System.out.println("User Name = " + user.getUsername());
            System.out.println("Bank Name = " + user.getBankname());
            i++;
        }
    }
}
