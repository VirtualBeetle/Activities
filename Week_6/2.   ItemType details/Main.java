import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of item types:");
        int n = sc.nextInt();

        List<ItemType> itemTypes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.next().split(",");
            ItemType itemType = new ItemType(input[0], Double.parseDouble(input[1]), Double.parseDouble(input[2]));
            itemTypes.add(itemType);
        }

        Collections.sort(itemTypes, Comparator.comparing(ItemType::getName));

        System.out.format("%-10s %-10s %s\n", "Name", "Cost", "Deposit");

        for (ItemType itemType : itemTypes) {
            System.out.format("%-10s %-10s %s\n", itemType.getName(), itemType.getCostPerDay(), itemType.getDeposit());
        }
            }
}
