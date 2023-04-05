
class ItemType {
    private String name;
    private double deposit;
    private double costPerDay;

    // Constructors
    public ItemType() {
    }

    public ItemType(String name, double deposit, double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    // toString method override
    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s", name, deposit, costPerDay);
    }
}
