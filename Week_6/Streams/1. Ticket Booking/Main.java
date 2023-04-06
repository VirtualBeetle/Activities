import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of bookings");
        int n = Integer.parseInt(br.readLine());

        List<TicketBooking> bookings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter customer name");
            String name = br.readLine();
            System.out.println("Enter number of tickets");
            int tickets = Integer.parseInt(br.readLine());
            System.out.println("Enter the price");
            double price = Double.parseDouble(br.readLine());
             
            bookings.add(new TicketBooking(name, tickets, price));
        }
            System.out.println("Customer    No Of Tickets    Price");
        bookings.stream()
                .sorted(Comparator.comparing(TicketBooking::getPrice))
                .forEach(System.out::println);
    }
}
