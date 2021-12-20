package vn.codegym.shape;

public class Bird extends Animal implements Flyable, Speakable {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Liu Lo");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flying");
    }
}
