import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> usernames = new ArrayList<String>();

        while (true) {
            System.out.println("Enter the username " + (usernames.size() + 1));
            usernames.add(sc.nextLine());

            System.out.println("Do you want to continue? (y/n)");
            if (!sc.nextLine().equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("The Names entered are:");
        for (String username : usernames) {
            System.out.println(username);
        }
    }
}
