package vn.codegym.generic;

public class LinkedList<T> implements List<T> {
    private static final int CAPACITY = 10;
    private int size;
    Object[] elements = new Object[CAPACITY];

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T value) {
        return true;
    }

    @Override
    public void add(T element) {
        elements[0] = element;
        size++;
    }

    public T get(int index) {
        return (T) elements[index];
    }
}
