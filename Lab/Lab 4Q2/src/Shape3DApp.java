import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of shapes");
        int noOfShapes = sc.nextInt();
        int i;

        Shape[] shapes = new Shape[noOfShapes];

        for (i = 0; i < noOfShapes; i++) {
            System.out.println("1 == Cuboid");
            System.out.println("2 == Sphere");
            System.out.println("3 == Pyramid");
            System.out.println("4 == Cone");
            System.out.println("5 == Cylinder");

            int shape = sc.nextInt();
            int length, breadth, radius, base, height;

            switch (shape) {
                case 1:
                    System.out.print("Length: ");
                    length = sc.nextInt();
                    System.out.print("Breadth: ");
                    breadth = sc.nextInt();
                    shapes[i] = new Cuboid(length, breadth);
                    break;
                case 2:
                    System.out.print("Radius: ");
                    radius = sc.nextInt();
                    shapes[i] = new Sphere(radius);
                    break;
                case 3:
                    System.out.print("Base: ");
                    base = sc.nextInt();
                    System.out.print("Height: ");
                    height = sc.nextInt();
                    shapes[i] = new Pyramid(base, height);
                    break;
                case 4:
                    System.out.print("Radius: ");
                    radius = sc.nextInt();
                    System.out.print("Height: ");
                    height = sc.nextInt();
                    shapes[i] = new Cone(radius, height);
                    break;
                case 5:
                    System.out.print("Radius: ");
                    radius = sc.nextInt();
                    System.out.print("Height: ");
                    height = sc.nextInt();
                    shapes[i] = new Cylinder(radius, height);
                    break;
            }
        }
        double area = 0;
        for (i = 0; i < noOfShapes; i++) area += shapes[i].area();
        System.out.printf("Area: %.2f", area);
    }
}

