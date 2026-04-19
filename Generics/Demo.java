package Generics;

import java.util.ArrayList;

public class Demo {

    /*
     * Generics is a feature of Java that allows you to create generic classes,
     * interfaces, and methods. It provides type safety and allows you to write
     * code that can work with different types of data.
     * java 5 are introduced
     * why generics are used ? -> Type safe code making
     * 
     */
    public static void main(String[] args) {

        ArrayList arr = new ArrayList<>(); // It is not a type safe example

        arr.add(1);
        arr.add("hi");

        arr.add(1.5);
        arr.add("hi");

        System.out.println((int) arr.get(0)); // It can be required the type casting
        System.out.println((String) arr.get(1)); // Not give at coplie time errer

        ArrayList<Integer> arr2 = new ArrayList<>(); // It is the type safe

        arr2.add(1);
        // arr2.add("hi"); Get at complie time errer
        System.out.println(arr2.get(0)); // Not reqiured any manual type casing . jvm make it automatically

    }

}
