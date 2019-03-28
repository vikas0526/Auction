public class ItemDoesNotExistException extends Exception {
    public ItemDoesNotExistException() {
        super("This is a ItemDoesNotExistException, Bids can only be placed on existing items, please create a new item");
    }
}
