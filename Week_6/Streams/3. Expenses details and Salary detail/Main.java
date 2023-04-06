import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Expenses> expensesList = new ArrayList<>();
        double salary, totalExpenses;

        System.out.println("Enter expense for food");
        Double foodCost = sc.nextDouble();
        Expenses food = new Expenses("food", foodCost);
        expensesList.add(food);

        System.out.println("Enter expense for rent");
        Double rentCost = sc.nextDouble();
        Expenses rent = new Expenses("rent", rentCost);
        expensesList.add(rent);

        System.out.println("Enter expense for shopping");
        Double shoppingCost = sc.nextDouble();
        Expenses shopping = new Expenses("shopping", shoppingCost);
        expensesList.add(shopping);

        System.out.println("Enter expense for groceries");
        Double groceriesCost = sc.nextDouble();
        Expenses groceries = new Expenses("groceries", groceriesCost);
        expensesList.add(groceries);

        System.out.println("Enter expense for electricity");
        Double electricityCost = sc.nextDouble();
        Expenses electricity = new Expenses("electricity", electricityCost);
        expensesList.add(electricity);

        System.out.println("Enter salary");
        salary = sc.nextDouble();

        totalExpenses = expensesList.stream().mapToDouble(Expenses::getCost).reduce(0, Double::sum);

        if (totalExpenses > salary) {
            System.out.println("Expenses exceeds Salary");
        } else {
            double savings = salary - totalExpenses;
            System.out.printf("Savings amount will be Rs.%.1f\n", savings);
        }

        sc.close();
    }
}
