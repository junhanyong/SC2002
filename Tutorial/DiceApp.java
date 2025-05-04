import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args){
        int diceValue = 0;
        Scanner sc = new Scanner(System.in);
        Dice dice = null;

        System.out.println("Press <key> to roll the first dice");
        sc.nextLine();

        dice = new Dice();
        dice.printDiceValue();
        diceValue += dice.getDiceValue();

        System.out.println("Press <key> to roll the second dice");
        sc.nextLine();
        dice.setDiceValue();
        dice.printDiceValue();
        diceValue += dice.getDiceValue();

        System.out.println("Your total number is: " + diceValue);
    }
}
