public class ItemBidShouldBeHigherException extends Exception {
    /**
     * This Exception is used in case the user bids lower than the previous highest amount on a item.
     */
    public ItemBidShouldBeHigherException() {
        super("This is a ItemBidShouldBeHigherException, Bid should be higher than previous bid");
    }
}
