public class Expenses {
    private String expenseType;
    private Double cost;

    public Expenses() {}

    public Expenses(String expenseType, Double cost) {
        this.expenseType = expenseType;
        this.cost = cost;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
