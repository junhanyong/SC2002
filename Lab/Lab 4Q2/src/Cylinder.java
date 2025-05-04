public class Cylinder implements Shape{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        Circle circle = new Circle(radius);
        return 2 * circle.area() + 2 * 3.14 * radius * height;
    }
}
