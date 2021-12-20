package vn.codegym.generic;

import vn.codegym.shape.Animal;
import vn.codegym.shape.Cat;
import vn.codegym.shape.Crocodile;

public class Generic {
    public static void main(String[] args) {
        ArrayListDouble arrayListDouble = new ArrayListDouble();
        arrayListDouble.add(0.3);

        ArrayList<Animal> students = new ArrayList<>();
        students.add(new Cat("A"));
        students.add(new Crocodile("A"));
        System.out.println(students.size());
       // showSize(students);
        LinkedList<Animal> linkedList = new LinkedList<>();
        linkedList.add(new Cat("A"));
        linkedList.add(new Crocodile("A"));
        showSize(linkedList);
    }

    private static void showSize(List students) {
        System.out.println(students.size());
    }


}
