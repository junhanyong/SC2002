import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        Circle cir = null;

        System.out.println("==== Circle Computation =====");
        System.out.println("|1. Create a new circle |");
        System.out.println("|2. Print Area |");
        System.out.println("|3. Print circumference |");
        System.out.println("|4. Quit |");
        System.out.println("=============================");


        do {
            System.out.println("Choose option (1-3):");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the radius to compute the area and circumference");
                    double rad = sc.nextDouble();
                    cir = new Circle(rad);
                    System.out.println("A new circle is created");
                    break;

                case 2:
                    if (cir != null) cir.printArea();
                    break;

                case 3:
                    if (cir != null) cir.printCircumference();
                    break;

                default:
                    break;
            }
        } while (option < 4 && option > 0);

        System.out.println("Thank you!");
    }
}