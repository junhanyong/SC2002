public class Cuboid implements Shape{
    private int length;
    private int breadth;

    public Cuboid(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double area(){
        Rectangle rectangle = new Rectangle(length, breadth);
        return 4 * rectangle.area() + 2 * new Square(length).area();
    }

}
