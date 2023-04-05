import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //    System.out.print("Enter the number of passengers: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        TreeMap<String, TreeSet<String>> flightPassengerMap = new TreeMap<>();
     //   System.out.print("Enter the number of passengers: ");
        for (int i = 0; i < n; i++) {
            
            String input = scanner.nextLine();
            String[] values = input.split("\\|");
            String flight = values[0];
            String passenger = values[1];
            TreeSet<String> passengerSet = flightPassengerMap.getOrDefault(flight, new TreeSet<>());
            passengerSet.add(passenger);
            flightPassengerMap.put(flight, passengerSet);
        }

        System.out.println("Flights and Passengers in ascending order");
        for (Map.Entry<String, TreeSet<String>> entry : flightPassengerMap.entrySet()) {
            String flight = entry.getKey();
            TreeSet<String> passengerSet = entry.getValue();
            System.out.println(flight);
            for (String passenger : passengerSet) {
                System.out.println("--" + passenger);
            }
        }
    }
}
