import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Expense> expenses = new TreeSet<Expense>();
        String category;
        int amount;
        String choice = "yes";

        while (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter expense category");
            category = sc.next();
            System.out.println("Enter expense amount");
            amount = sc.nextInt();
            expenses.add(new Expense(category, amount));
            System.out.println("Do you want to continue(yes/no):");
            choice = sc.next();
        }

        System.out.println("Top spending categories");
        System.out.println(String.format("%-15s%-15s", "Category", "Amount"));

        int totalAmount = 0;
        Iterator<Expense> iterator = expenses.descendingIterator();
        while (iterator.hasNext()) {
            Expense e = iterator.next();
            System.out.println(String.format("%-15s%-15d", e.getExpenseCategory(), e.getAmount()));
            totalAmount += e.getAmount();
        }

        System.out.println("Total amount spent: " + totalAmount);
    }

}

class Expense implements Comparable<Expense> {

    private String expenseCategory;
    private int amount;

    public Expense(String expenseCategory, int amount) {
        this.expenseCategory = expenseCategory;
        this.amount = amount;
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(String expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(Expense e) {
        return this.getAmount() - e.getAmount();
    }

}
