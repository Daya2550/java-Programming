package Optional;

import java.util.Optional;

public class Checking {
    public static void main(String[] args) {
        // creating the optional
        Optional<Integer> of = Optional.of(10);
        Optional<Integer> ofNullable = Optional.ofNullable(null);
        Optional<Object> empty = Optional.empty();

        if (ofNullable.isPresent()) {
            System.out.println("present the values ");
        }

        if (empty.isEmpty()) {
            System.out.println("Empty");
        }

    }

}
