class SilverStall {
    protected String name;
    protected String detail;
    protected String owner;
    protected int cost;

    // default constructor
    public SilverStall() {
    }

    // parameterized constructor
    public SilverStall(String name, String detail, String owner, int cost) {
        this.name = name;
        this.detail = detail;
        this.owner = owner;
        this.cost = cost;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    // method to compute total cost
    public int computeTotalCost() {
        return cost;
    }
}
