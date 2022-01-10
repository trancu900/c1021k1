package solid.open.close;

public class Circle implements Shape {
    public double radius;
    public final double PI = 3.141592653589793;

    public double area() {
        return PI * radius * radius;
    }
}
