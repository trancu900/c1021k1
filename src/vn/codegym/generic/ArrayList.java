package vn.codegym.generic;

public class ArrayList<T> {
    private static final int CAPACITY = 10;
    private int size;
    Object[] elements = new Object[CAPACITY];

    public int size() {
        return size;
    }

    public boolean contains(T value) {
        return true;
    }

    public void add(T element) {
        elements[0] = element;
        size++;
    }

    public T get(int index) {
        return (T) elements[index];
    }
}
