import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the event name");
        String name = sc.nextLine();

        System.out.println("Enter the event details");
        String details = sc.nextLine();

        System.out.println("Enter the event manager");
        String manager = sc.nextLine();

        Event event = new Event(name, details, manager);
        EventBO eventBO = new EventBO();
        eventBO.saveToFile(event);

        System.out.println("Event details saved to event.txt file.");
    }
}
