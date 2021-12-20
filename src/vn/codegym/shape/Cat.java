package vn.codegym.shape;

public class Cat extends Animal implements Runable, Speakable {
    public Cat(String name) {
        super(name);
    }

    public void speak() {
        System.out.println("Meo Meo");
    }

    @Override
    public void run() {
        System.out.println(" running");
    }
}
