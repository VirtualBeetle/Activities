import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EventBO {
    public void saveToFile(Event event) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("event.txt"))) {
            writer.write("Event details");
            writer.newLine();
            writer.write("Event name:" + event.getName());
            writer.newLine();
            writer.write("Event details:" + event.getDetails());
            writer.newLine();
            writer.write("Event manager:" + event.getManager());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
