import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ItemType> itemList = new ArrayList<>();
        String choice;

        do {
            ItemType item = new ItemType();
            System.out.println("Enter the details of Item Type " + (itemList.size() + 1));
            System.out.println("Name:");
            item.setName(sc.nextLine());

            System.out.println("Deposit:");
            item.setDeposit(Double.parseDouble(sc.nextLine()));

            System.out.println("Cost per Day:");
            item.setCostPerDay(Double.parseDouble(sc.nextLine()));

            itemList.add(item);

            System.out.println("Do you want to continue?(y/n)");
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("y"));

        System.out.printf("%-20s%-20s%-20s\n", "Name", "Deposit", "CostPerDay");
        for (ItemType item : itemList) {
            System.out.println(item);
        }

        sc.close();
    }
}
