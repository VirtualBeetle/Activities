public class ItemType {
    private String name;
    private Double costPerDay;
    private Double deposit;

    public ItemType() {}

    public ItemType(String name, Double costPerDay, Double deposit) {
        this.name = name;
        this.costPerDay = costPerDay;
        this.deposit = deposit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }
}
