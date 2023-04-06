import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Hall> hallList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of halls:");
        int numOfHalls = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numOfHalls; i++) {
            String[] hallDetails = sc.nextLine().split(",");
            Hall hall = new Hall(hallDetails[0], Double.parseDouble(hallDetails[1]), hallDetails[2]);
            hallList.add(hall);
        }

        System.out.format("%-15s %-10s %s\n", "Name", "Cost", "Owner");
        hallList.stream()
                .sorted((a, b) -> a.getOwner().compareToIgnoreCase(b.getOwner()))
                .forEach(x -> System.out.format("%-15s %-10s %s\n", x.getName(), x.getCostPerDay(), x.getOwner()));
    }
}
