import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of events:");
        int n = scanner.nextInt();
        scanner.nextLine();

        TreeMap<Integer, Integer> priceMap = new TreeMap<>();

        System.out.println("Enter event details in CSV(Customer Name,Ticket Price,No of Seats Booked)");
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] eventDetails = input.split(",");
            int price = Integer.parseInt(eventDetails[1]);
            int seats = Integer.parseInt(eventDetails[2]);
            if (priceMap.containsKey(price)) {
                seats += priceMap.get(price);
            }
            priceMap.put(price, seats);
        }

        System.out.printf("%-15s %s\n", "Ticket Price", "Tickets Booked");
        for (int price : priceMap.keySet()) {
            int tickets = priceMap.get(price);
            System.out.printf("%-15d %d\n", price, tickets);
        }
    }
}
