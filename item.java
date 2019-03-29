import java.util.ArrayList;

public class item {
    int max = 1000;
    private String name;
    private float winningBid;
    private int[] allBids = new int[max];
    private ArrayList<Float> Bids = new ArrayList<Float>();

    /**
     * Constructor for a individual item. Parameter of Bids is made using an array list,
     * due to its dynamic characteristic to store the new bids.
     *
     * @param name
     * @param winningBid
     * @param bids
     */

    public item(String name, float winningBid, ArrayList<Float> bids) {
        this.name = name;
        this.winningBid = winningBid;
        Bids = bids;
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

    /**
     * toString mathod used for printing and displaying user requested item with their bids
     *
     * @return
     */
    public String toString() {
        return "item{" + name +
                "Bids=" + Bids +
                '}';
    }


}
