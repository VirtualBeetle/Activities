import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StallBO {
    
    public Stall readStallFromFile() {
        Stall stall = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line = reader.readLine();
            String[] data = line.split(",");
            stall = new Stall(data[0], data[1], data[2]);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return stall;
    }
    
    public void display(Stall stall) {
        System.out.println("Name: " + stall.getName());
        System.out.println("Category: " + stall.getCategory());
        System.out.println("Owner: " + stall.getOwner());
    }
}
