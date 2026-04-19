package Generics;

public class ConstructerLeval {
    public static void main(String[] args) {
        conLerver c = new conLerver("hi");
        conLerver c2 = new conLerver(10);
    }
}

class conLerver {

    <T> conLerver(T data) {
        System.out.println(data);
    }

}