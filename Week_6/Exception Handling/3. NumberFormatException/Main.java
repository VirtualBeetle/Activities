import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemType itemType = new ItemType();
        System.out.println("Enter the Item type details:");
        System.out.println("Enter the name:");
        itemType.setName(sc.nextLine());
        System.out.println("Enter the deposit:");
        try {
            itemType.setDeposit(Double.parseDouble(sc.nextLine()));
            System.out.println("Enter the cost per day:");
            itemType.setCostPerDay(Double.parseDouble(sc.nextLine()));
            System.out.println("The details of the item type are:");
            System.out.println(itemType);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}

