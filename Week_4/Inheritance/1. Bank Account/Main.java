import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Account Type");
        System.out.println("1.Savings Account");
        System.out.println("2.Current Account");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        switch (choice) {
            case 1:
                System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
                String[] savingsDetails = scanner.nextLine().split(",");
                SavingsAccount savingsAccount = new SavingsAccount(savingsDetails[0], savingsDetails[1], savingsDetails[2], savingsDetails[3]);
                savingsAccount.display();
                break;
            case 2:
                System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
                String[] currentDetails = scanner.nextLine().split(",");
                CurrentAccount currentAccount = new CurrentAccount(currentDetails[0], currentDetails[1], currentDetails[2], currentDetails[3]);
                currentAccount.display();
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        scanner.close();
    }
}
