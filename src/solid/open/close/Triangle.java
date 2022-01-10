package solid.open.close;

public class Triangle implements Shape {
    public double high;
    public double sideBottom;

    @Override
    public double area() {
        return (high * sideBottom) / 2;
    }
}
