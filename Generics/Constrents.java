package Generics;

public class Constrents {
    public static void main(String[] args) {
        Demo1 d = new Demo1(10);
        d.show();

        Demo1 d2 = new Demo1(10.5);
        d2.show();

        // Demo d1 = new Demo("hi"); // Get complier time ereer

    }
}

class Demo1<T extends Number> { // adding the Constrentes as numbers using extendes

    private T Box;

    public Demo1(T box) {
        Box = box;
    }

    public T getBox() {
        return Box;
    }

    public void setBox(T box) {
        Box = box;
    }

    public void show() {
        System.out.println(Box);
    }

}