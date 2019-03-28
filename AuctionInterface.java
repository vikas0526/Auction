import java.util.ArrayList;
import java.util.Scanner;

public class AuctionInterface {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);

        auctionMethods aM = new auctionMethods();


        System.out.println("Hi, Hope all is good with you?");
        System.out.println("Please begin using your program");
        String input = "";
        /**
         * while loop to help the user navigate
         * through the program, it is accompanied with a switch format.
         */
        while (!input.equalsIgnoreCase("Q")) {

            System.out.println("(A)-Add Auction item");
            System.out.println("(B)- Start Bidding on existing items");
            System.out.println("(W)- Get current winning bid for selected item");
            System.out.println("(AB)- Get all bids for an item");
            System.out.println("(AC)- Get all items on which the user has bid");
            System.out.println("(Q)-Quit");
            System.out.println("Please select an option:");
            input = sc.nextLine();
            switch (input) {
                case "A":
                    try {
                        System.out.println("Please enter the name of your item");
                        String name = sc.nextLine();
                        System.out.println("please enter the initial bid of your item");
                        float winner = sc.nextFloat();
                        ArrayList<Float> amount = new ArrayList<Float>();
                        amount.add(winner);
                        item newItem = new item(name, winner, amount);
                        aM.adding(newItem);
                    } catch (ItemAlreadyExistsException e) {
                        e.printStackTrace();
                    }
                    break;
                case "B":
                   try {
                        System.out.println("Please provide the name of the product you want to bid on: ");
                        String name = sc.nextLine();
                        System.out.println("Please mention the new amount: ");
                        float amount3 = sc.nextFloat();
                        aM.biding(name, amount3);
                    } catch (ItemBidShouldBeHigherException  e) {
                       e.printStackTrace();
                    }
                    break;
                case "W":
                    System.out.println("Which product's winning bid would you like to see: ");
                    String name2 = sc.nextLine();
                    aM.getCurrentWinner(name2);
                    break;
                case "AB":
                    System.out.println("Please select the item you would like to see all your bids for: ");
                    String name3 = sc.nextLine();
                    aM.getBidsForOne(name3);
                    break;
                case "AC":
                    System.out.println("Getting all items for which the user has bid : ");
                    aM.getAllBidsDone();
                    break;
                case"Q":
                    System.exit(0);
                    break;
            }
        }
    }
}
