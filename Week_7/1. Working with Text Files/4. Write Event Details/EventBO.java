import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EventBO {
    public void saveToFile(List<Event> eventList) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("event.txt"));
            writer.write("Event details:\n");
            for (Event event : eventList) {
                writer.write(event.getName() + "," + event.getDetails() + "," + event.getManager() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
