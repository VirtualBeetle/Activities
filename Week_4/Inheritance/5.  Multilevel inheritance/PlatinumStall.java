class PlatinumStall extends GoldStall {
    private int projector;

    // default constructor
    public PlatinumStall() {
    }

    // parameterized constructor
    public PlatinumStall(String name, String detail, String owner, int cost, int tvSet, int projector) {
        super(name, detail, owner, cost, tvSet);
        this.projector = projector;
    }

    // getters and setters
    public int getProjector() {
        return projector;
    }

    public void setProjector(int projector) {
        this.projector = projector;
    }

    // method to compute total cost
    public int computeTotalCost() {
        return cost + (this.getTvSet() * 100) + (projector * 500);
    }
}
