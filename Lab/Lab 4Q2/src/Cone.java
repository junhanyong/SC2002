public class Cone implements Shape{
    private int radius;
    private int height;

    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        Circle circle = new Circle(radius);
        return 3.14 * radius * height + circle.area();
    }
}
