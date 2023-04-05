import java.util.Scanner;
class GoldStall extends SilverStall {
    private int tvSet;
    public GoldStall() {
    }
    public GoldStall(String name, String detail, String owner, int cost, int tvSet) {
        super(name, detail, owner, cost);
        this.tvSet = tvSet;
    }
    public int getTvSet() {
        return tvSet;
    }
    public void setTvSet(int tvSet) {
        this.tvSet = tvSet;
    }
    public int computeTotalCost() {
        return cost + (tvSet * 100);
    }
}
