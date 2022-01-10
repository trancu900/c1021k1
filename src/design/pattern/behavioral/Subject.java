package design.pattern.behavioral;

public interface Subject<T> {
    void register(T observer);

    void unregister(T observer);

    void notifyALL();
}
