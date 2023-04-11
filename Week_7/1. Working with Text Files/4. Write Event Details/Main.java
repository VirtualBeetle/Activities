import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of events");
        int numEvents = scanner.nextInt();
        scanner.nextLine();

        List<Event> eventList = new ArrayList<>();
        for (int i = 0; i < numEvents; i++) {
            System.out.println("Enter event details in format(name,details,manager name)");
            String[] eventDetails = scanner.nextLine().split(",");
            Event event = new Event(eventDetails[0], eventDetails[1], eventDetails[2]);
            eventList.add(event);
        }

        EventBO eventBO = new EventBO();
        eventBO.saveToFile(eventList);

        scanner.close();
    }
}
