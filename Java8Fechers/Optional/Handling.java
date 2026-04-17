package Optional;

import java.util.Optional;

public class Handling {
    public static void main(String[] args) {
        // creating the optional
        Optional<Integer> of = Optional.of(10);
        Optional<Integer> ofNullable = Optional.ofNullable(null);
        Optional<Object> empty = Optional.empty();

        System.out.println(empty.orElse(25));
        System.out.println(ofNullable.orElseGet(() -> 50));
        empty.orElseThrow(() -> new ArithmeticException());
    }
}
