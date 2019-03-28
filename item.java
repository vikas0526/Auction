import java.util.ArrayList;

public class item {
    int max=1000;
    private String name;
    private float winningBid;
    private int[] allBids = new int[max];
    private ArrayList<Float> Bids = new ArrayList<Float>();


    public item(String name, float winningBid, ArrayList<Float> bids) {
        this.name = name;
        this.winningBid = winningBid;
        Bids = bids;
    }
    public String toString() {
        return "item{" +name+
                "Bids=" + Bids +
                '}';
    }

    public ArrayList<Float> getBids() {
        return Bids;
    }

    public void setBids(ArrayList<Float> bids) {
        Bids = bids;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public float getWinningBid() {
        return winningBid;
    }

    public void setWinningBid(float winningBid) {
        this.winningBid = winningBid;
    }


}
