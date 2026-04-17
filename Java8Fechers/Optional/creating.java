package Optional;

import java.util.Optional;

public class creating {
    public static void main(String[] args) {
        // creating the optional
        Optional<Integer> of = Optional.of(10);
        Optional<Integer> ofNullable = Optional.ofNullable(20);
        Optional<Object> empty = Optional.empty();

        System.out.println(of);
        System.out.println(of.get());

        System.out.println(ofNullable);
        System.out.println(ofNullable.get());

    }
}
