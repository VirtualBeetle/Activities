public class Hall {
    private String name;
    private Double costPerDay;
    private String owner;

    public Hall() {
        // Default constructor
    }

    public Hall(String name, Double costPerDay, String owner) {
        this.name = name;
        this.costPerDay = costPerDay;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public String getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
