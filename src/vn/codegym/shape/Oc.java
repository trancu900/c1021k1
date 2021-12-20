package vn.codegym.shape;

public class Oc extends Animal implements Runable {
    public Oc(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(" Running");
    }


}
