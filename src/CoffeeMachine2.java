import java.util.Scanner;
import java.util.Arrays;

public class CoffeeMachine2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menu = {
                "short coffee",
                "long coffee",
                "mochaccino",
                "cappuccino",
                "green tea",
                "earl grey"
        };
        double[] prices = {
                0.70,
                0.90,
                1.30,
                1.20,
                0.80,
                0.85
        };
        double[] allowedCoins = {
                0,
                0.05,
                0.10,
                0.20,
                0.50,
                1,
                2
        };

        while (true) {
            // display the menu and prices
            System.out.println("============ MENU ============");
            for (int i = 0; i < menu.length; i++) {
                System.out.printf("%2d: %-10s %14.2f\n", (i + 1), menu[i], prices[i]);
            }

            // ask the user to put coins into the machine
            double sum = 0;
            while (true) {
                System.out.print("Put coins into the machine: ");
                double coin = scanner.nextDouble();
                if (coin == -1) {
                    System.exit(0);
                } else if (coin == 0) {
                    break;
                } else if (Arrays.binarySearch(allowedCoins, coin) < 0) {
                    System.out.println("No such coin.");
                } else {
                    sum += coin;
                }
            }

            // ask the user to choose a product from the menu
            System.out.print("Choose an item: ");
            int choice = scanner.nextInt();
            if (choice < 1 || choice > menu.length) {
                System.out.println("Please select between 1 and " + menu.length + ".");
                continue;
            }

            // ask for the sugar amount
            System.out.print("Sugar amount (0-5): ");
            int sugar = scanner.nextInt();
            if (sugar < 0 || sugar > 5) {
                System.out.println("Sugar amount can be between 0 and 5.");
                continue;
            }

            // check if the sum is enough for the selected product
            double price = prices[choice - 1];
            if (sum < price) {
                System.out.printf("You don't have enough money (%.2f), the price is %.2f.\n", sum, price);
                continue;
            }

            // display the final description
            System.out.printf("Preparing %s with %d sugar for %.2f leva.\n", menu[choice - 1], sugar, price);

            // wait for 3 seconds
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // display the text: "Your drink is ready!"
            System.out.println("Your drink is ready!");
        }
    }
}

