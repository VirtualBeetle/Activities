import java.util.*;

class Hall implements Comparable<Hall> {
    private String name;
    private String contactNumber;
    private Double costPerDay;
    private String ownerName;

    public Hall(String name, String contactNumber, Double costPerDay, String ownerName) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15.1f%-15s", name, contactNumber, costPerDay, ownerName);
    }

    @Override
    public int compareTo(Hall hall) {
        if (this.costPerDay < hall.costPerDay) {
            return -1;
        } else if (this.costPerDay > hall.costPerDay) {
            return 1;
        } else {
            return this.name.compareTo(hall.name) * -1;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of halls:");
        int n = Integer.parseInt(scanner.nextLine());
        List<Hall> hallList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of hall " + (i + 1));
            String[] hallDetails = scanner.nextLine().split(",");
            Hall hall = new Hall(hallDetails[0], hallDetails[1], Double.parseDouble(hallDetails[2]), hallDetails[3]);
            hallList.add(hall);
        }
        Collections.sort(hallList);
        System.out.println("Sorted Order (from the least expensive to the most):");
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Name", "Contact number", "Cost per day", "Owner name");
        for (Hall hall : hallList) {
            System.out.println(hall.toString());
        }
    }
}
