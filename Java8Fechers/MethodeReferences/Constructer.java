package MethodeReferences;

import java.util.function.Function;

public class Constructer {
    public static void main(String[] args) {
        Function<String, String> f = String::new;

        System.out.println(f.apply("null"));
    }
}
