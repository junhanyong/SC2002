public class VendingMachineApp {
    public static void main(String[] args){
        double drinkCost, amount;

        VendingMachine vendingMachine = new VendingMachine();

        drinkCost = vendingMachine.selectDrink();
        amount = vendingMachine.insertCoins(drinkCost);
        vendingMachine.checkChange(amount, drinkCost);
        vendingMachine.printReceipt();
    }


}
