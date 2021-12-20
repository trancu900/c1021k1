package vn.codegym.generic;

public class ArrayListInteger {
    private static final int CAPACITY = 10;
    int[] elements = new int[CAPACITY];

    public int size() {
        return elements.length;
    }

    public boolean contains(int value) {
        return true;
    }

    public void add(int element) {
        elements[0] = element;
    }


}
