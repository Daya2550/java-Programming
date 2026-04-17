package Stream;

import java.util.stream.Stream;

public class Methodes {
    public static void main(String[] args) {
        Stream<Integer> st = Stream.of(1, 2, 3, 4, 5, 6, 7);

        st
                .filter(x -> x % 2 == 0) // filtering the values to use the removing values
                .map(x -> x + 1) // to changing the value or updating the values each
                .sorted() // sorting the values of the arrays
                .distinct() // removing the duplict values
                .limit(2) // to getting the how much values or giving the limit
                .skip(1); // skipling the values and the values are skipped

    }
}
