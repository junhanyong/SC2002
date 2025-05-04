public class Circle implements Shape{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double area(){
        return 3.14 * radius * radius;
    }
}
