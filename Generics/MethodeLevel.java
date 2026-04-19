package Generics;

public class MethodeLevel {
    public static void main(String[] args) {
        Display(10);
        Display("hi");
        Integer a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Display(a);
    }

    public static <T> void Display(T data) {
        System.out.println(data);
    }

    public static <T> void Display(T[] arr) {
        for (T a : arr) {
            System.out.println(a);
        }
    }
}
