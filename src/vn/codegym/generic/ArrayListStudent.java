package vn.codegym.generic;

public class ArrayListStudent {
    private static final int CAPACITY = 10;
    Student[] elements = new Student[CAPACITY];

    public int size() {
        return elements.length;
    }

    public boolean contains(Student value) {
        return true;
    }

    public void add(Student element) {
        elements[0] = element;
    }


}
