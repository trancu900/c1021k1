package vn.codegym.shape;

public class Crocodile extends Animal implements Swimable, Runable, Speakable {
    public Crocodile(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("guw");
    }

    @Override
    public void run() {
        System.out.println(getName() + " running");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swiming");
    }
}
