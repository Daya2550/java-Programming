package MethodeReferences;

import java.util.Arrays;
import java.util.List;

public class functionFreffrence {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Dayanand ", "Sagar");

        list = list.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(list);

    }
}
