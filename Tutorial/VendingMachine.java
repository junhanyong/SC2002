import java.util.Scanner;

public class VendingMachine {
    // constructor
    public VendingMachine() {}

    // get the drink selection, and return the cost of the drink
    public double selectDrink(){
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("====== Vending Machine ======");
        System.out.println("|1. Buy Beer ($3.00) |");
        System.out.println("|2. Buy Coke ($1.00) |");
        System.out.println("|3. Buy Green Tea ($5.00) |");
        System.out.println("|============================");
        System.out.println("Please enter selection:");

        choice = sc.nextInt();

        switch(choice){
            case 1:
                return 3.00;
            case 2:
                return 1.00;
            case 3:
                return 5.00;
            default:
                return 0.00;
        }
    }

    // insert the coins and returns the amount inserted
    public double insertCoins(double drinkCost){
        Scanner sc = new Scanner(System.in);
        char choice;
        double total = 0.00;
        System.out.println("Please insert coins:");
        System.out.println("========== Coins Input ===========");
        System.out.println("|Enter 'Q' for ten cents input |");
        System.out.println("|Enter 'T' for twenty cents input|");
        System.out.println("|Enter 'F' for fifty cents input |");
        System.out.println("|Enter 'N' for a dollar input |");
        System.out.println("==================================");

        do {
            choice = sc.next().charAt(0);
            switch (choice) {
                case 'Q':
                    total += 0.10;
                    break;
                case 'T':
                    total += 0.20;
                    break;
                case 'F':
                    total += 0.50;
                    break;
                case 'N':
                    total += 1.00;
                    break;
            }
            System.out.printf("Coins inserted: %.2f \n", total);
        } while (total < drinkCost);

        return total;
    }

    // check the change and print the change on screen
    public void checkChange(double amount, double drinkCost){
        double change = amount - drinkCost;
        if (change >= 0){
            System.out.printf("Change: $%.2f\n", change);
        }

    }

    // print the receipt and collect the drink
    public void printReceipt(){
        System.out.println("Please collect your drink");
        System.out.println("Thank you!!");
    }

}
