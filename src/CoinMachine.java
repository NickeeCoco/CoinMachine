// Morgane Bentzinger - 261062953

/*
    This program determines the amount of change returned by a coin machine.
    It takes 2 parameters:
    1) cash: amount of money dropped into the machine (in cents)
    2) price: cost of the item wanted by the customer (in cents)
    It determines and prints to the console the most convenient exact change for the transaction.

    This program assumes that:
     - the amount of money dropped into the machine will always be equal or greater than the cost of the item
     - amounts are integer amounts in cents ($2.75 = int 275)
     - amounts are only multiples of 5
     - the coin machine has an infinite number of each type of coins

 */

public class CoinMachine {
    public static void main(String[] args) {

        int cash = Integer.parseInt(args[0]);
        int price = Integer.parseInt(args[1]);

        int requiredChange = cash - price;
        int remainingChange;

        int toonies = requiredChange / 200;
        remainingChange = requiredChange % 200;

        int loonies = remainingChange / 100;
        remainingChange = remainingChange % 100;

        int quarters = remainingChange / 25;
        remainingChange = remainingChange % 25;

        int dimes = remainingChange / 10;
        remainingChange = remainingChange % 10;

        int nickels = remainingChange / 5;
        remainingChange = remainingChange % 5;


        System.out.println("Amount received: " + cash);
        System.out.println("Cost of the item: " + price);
        System.out.println("Required change: " + requiredChange);
        System.out.println();
        System.out.println("Change:");
        System.out.println("toonies x " + toonies);
        System.out.println("loonies x " + loonies);
        System.out.println("quarters x " + quarters);
        System.out.println("dimes x " + dimes);
        System.out.println("nickels x " + nickels);

    }
}

