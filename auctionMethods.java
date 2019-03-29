import java.util.ArrayList;

public class auctionMethods {
    /**
     * All our items will be stored in an ArrayList named storage.
     */
    ArrayList<item> storage = new ArrayList<item>();

    /**
     * This method below will be adding an item which has all three character's of winner amount, bidding and name.
     * It also deals with the exception regarding an item with the same name cant exist.
     * My program deals with items with different names.
     *
     * @param newItem
     * @throws ItemAlreadyExistsException
     */
    public void adding(item newItem) throws ItemAlreadyExistsException {
        if (checkExistance(newItem))
            throw new ItemAlreadyExistsException();
        storage.add(newItem);
    }

    /**
     * This method takes in new Bidding amounts for all existing items. It also handles the condition
     * regarding the newAmount having to greater than the actual Winning amount of the item. If not
     * satisfied, this method will throw the exception.
     *
     * @param name
     * @param newAmount
     * @throws ItemBidShouldBeHigherException
     */
    public void biding(String name, float newAmount) throws ItemBidShouldBeHigherException {

        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getName().equalsIgnoreCase(name)) {
                if (storage.get(i).getWinningBid() < newAmount) {
                    storage.get(i).setWinningBid(newAmount);
                    storage.get(i).getBids().add(newAmount);
                    break;
                }
                if (storage.get(i).getWinningBid() >= newAmount)
                    throw new ItemBidShouldBeHigherException();
            }
        }

    }

    /**
     * This is my helper method to identify if a new item already exists.
     *
     * @param newItem
     * @return
     */

    public boolean checkExistance(item newItem) {
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getName().equalsIgnoreCase(newItem.getName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method will display the current winning amount of an individual item requested by the user.
     *
     * @param name
     */

    public void getCurrentWinner(String name) {
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getName().equals(name)) {
                System.out.println(name + " its winning bid is: " + storage.get(i).getWinningBid());
            }
        }
    }

    /**
     * This method will display all the bids with a individual item requested by the user.
     *
     * @param name
     */

    public void getBidsForOne(String name) {
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getName().equals(name))
                System.out.println(storage.get(i).getName() + " bids are: " + storage.get(i).getBids());

        }
    }

    /**
     * Printing all the items with their bids.
     */

    public void getAllBidsDone() {
        System.out.println(storage);
    }
}

