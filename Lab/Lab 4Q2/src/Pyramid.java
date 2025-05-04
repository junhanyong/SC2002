public class Pyramid implements Shape{
    private int base;
    private int height;

    public Pyramid(int base, int height){
        this.base = base;
        this.height = height;
    }

    public double area(){
        Triangle triangle = new Triangle(base, height);
        return triangle.area() * 4 + base * base;
    }
}
