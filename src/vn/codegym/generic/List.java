package vn.codegym.generic;

public interface List<T> {
    int size();

    boolean contains(T o);

    void add(T element);
}
