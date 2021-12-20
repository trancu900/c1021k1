package vn.codegym.generic;

public class ArrayListDouble{
    private static final int CAPACITY = 10;
    double[] elements = new double[CAPACITY];

    public double size() {
        return elements.length;
    }

    public boolean contains(double value) {
        return true;
    }

    public void add(double element) {
        elements[0] = element;
    }


}
