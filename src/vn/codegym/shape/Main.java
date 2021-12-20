package vn.codegym.shape;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Object cat = new Cat("BTan");
        Animal bird = new Bird("Dan dang cang thang");
        Crocodile crocodile = new Crocodile("Duong Cu Dem");
        Oc oc = new Oc("Rich kid");
        //show(oc);
        //show(cat);
        //show(bird);
        show(new Siddeley());
    }


    private static void show(Flyable flyable) {
        flyable.fly();

//        System.out.println(animal);
//        if (animal instanceof Speakable)
//            ((Speakable) animal).speak();
//
//        if (animal instanceof Runable)
//            ((Runable) animal).run();


//        if (animal instanceof Bird)
//            ((Bird) animal).fly();
//        if (animal instanceof Crocodile) {
//            ((Crocodile) animal).run();
//            ((Crocodile) animal).swim();
//        }

    }

}
