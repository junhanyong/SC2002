import java.util.Scanner;
import java.util.ArrayList;

public class Shape2DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of shapes");
        int noOfShapes = sc.nextInt();
        int i;

        Shape[] shapes = new Shape[noOfShapes];

        for (i = 0; i < noOfShapes; i++) {
            System.out.println("1 == Square");
            System.out.println("2 == Rectangle");
            System.out.println("3 == Circle");
            System.out.println("4 == Triangle");
            System.out.println("5: Calculate area");

            int shape = sc.nextInt();
            int length, breadth, radius, base, height;

            switch (shape) {
                case 1:
                    System.out.print("Length: ");
                    length = sc.nextInt();
                    shapes[i] = new Square(length);
                    break;
                case 2:
                    System.out.print("Length: ");
                    length = sc.nextInt();
                    System.out.print("Breadth: ");
                    breadth = sc.nextInt();
                    shapes[i] = new Rectangle(length, breadth);
                    break;
                case 3:
                    System.out.print("Radius: ");
                    radius = sc.nextInt();
                    shapes[i] = new Circle(radius);
                    break;
                case 4:
                    System.out.print("Base: ");
                    base = sc.nextInt();
                    System.out.print("Height: ");
                    height = sc.nextInt();
                    shapes[i] = new Triangle(base, height);
                    break;
            }
        }
        double area = 0;
        for (i = 0; i < noOfShapes; i++) area += shapes[i].area();
        System.out.printf("Area: %.2f", area);
    }
}

