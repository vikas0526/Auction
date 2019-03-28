import java.util.ArrayList;

public class auctionMethods {
    ArrayList<item> storage = new ArrayList<item>();

    public void adding(item newItem) throws ItemAlreadyExistsException {
        if (checkExistance(newItem))
            throw new ItemAlreadyExistsException();
        storage.add(newItem);
    }

    public void biding(String name, float newAmount) throws ItemBidShouldBeHigherException{

        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getName().equalsIgnoreCase(name)) {
                if (storage.get(i).getWinningBid() < newAmount) {
                    storage.get(i).setWinningBid(newAmount);
                    storage.get(i).getBids().add(newAmount);
                    break;
                }
                if(storage.get(i).getWinningBid() >= newAmount)
                    throw new ItemBidShouldBeHigherException();
            }
        }
    }

    public boolean checkExistance(item newItem) {
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getName().equalsIgnoreCase(newItem.getName())) {
                return true;
            }
        }
        return false;
    }

    public void getCurrentWinner(String name) {
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getName().equals(name)) {
                System.out.println(name + " its winning bid is: " + storage.get(i).getWinningBid());
            }
        }
    }

    public void getBidsForOne(String name) {
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getName().equals(name))
                System.out.println(storage.get(i).getName() + " bids are: "+storage.get(i).getBids());

        }
    }
    public void getAllBidsDone(){
        System.out.println(storage);
    }
}

