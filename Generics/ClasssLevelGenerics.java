package Generics;

public class ClasssLevelGenerics {

    public static void main(String[] args) {

        genericDemo g = new genericDemo(); // Not type safe and not give the complie time ereer

        g.setBox("hi");
        // g.setBox(1); // not give ererr at complier time

        String s = (String) g.getBox(); // It can be requred the type casting . the defult it is in object format
        System.out.println(s);

        genericDemo<Integer> g1 = new genericDemo<>(); // It is the type safe and give the erer at complier time

        g1.setBox(10);
        Integer i = g1.getBox();
        System.out.println(i);

        // g1.setBox("hi"); // Give the coplier time ererr

    }
}

class genericDemo<T> {

    private T Box;

    public genericDemo(T box) {
        Box = box;
    }

    public genericDemo() {

    }

    public T getBox() {
        return Box;
    }

    public void setBox(T box) {
        Box = box;
    }

}