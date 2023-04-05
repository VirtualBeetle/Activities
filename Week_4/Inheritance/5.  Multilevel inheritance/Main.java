import java.util.*;
// Main driver class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Stall Type\n1.Silver Stall\n2.Gold Stall\n3.Platinum Stall");
        int choice = scanner.nextInt();
        if (choice==4){
            return ;
        }
        scanner.nextLine(); // consume the newline character after nextInt()

        System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost" +
                (choice == 2 ? ",Number of TV set" : "") + (choice == 3 ? ",Number of TV set,Number of Projectors" : "") + ")");
        String[] details = scanner.nextLine().split(",");

        if (choice == 1) {
            SilverStall silverStall = new SilverStall(details[0], details[1], details[2], Integer.parseInt(details[3]));
            System.out.println("Stall Name:" + silverStall.getName());
            System.out.println("Details:" + silverStall.getDetail());
            System.out.println("Owner Name:" + silverStall.getOwner());
            System.out.println("Total Cost:" + silverStall.computeTotalCost());
        } else if (choice == 2) {
            GoldStall goldStall = new GoldStall(details[0], details[1], details[2], Integer.parseInt(details[3]),
                    Integer.parseInt(details[4]));
            System.out.println("Stall Name:" + goldStall.getName());
            System.out.println("Details:" + goldStall.getDetail());
            System.out.println("Owner Name:" + goldStall.getOwner());
            System.out.println("TV Sets:" + goldStall.getTvSet());
            System.out.println("Total Cost:" + goldStall.computeTotalCost());
        } else if (choice == 3) {
            PlatinumStall platinumStall = new PlatinumStall(details[0], details[1], details[2], Integer.parseInt(details[3]),
                    Integer.parseInt(details[4]), Integer.parseInt(details[5]));
            System.out.println("Stall Name:" + platinumStall.getName());
            System.out.println("Details:" + platinumStall.getDetail());
            System.out.println("Owner Name:" + platinumStall.getOwner());
            System.out.println("TV Sets:" + platinumStall.getTvSet());
            System.out.println("Projectors:" + platinumStall.getProjector());
            System.out.println("Total Cost:" + platinumStall.computeTotalCost());
        } 

        scanner.close();
    }
}
