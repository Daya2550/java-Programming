package Stream;

import java.util.stream.Stream;

public class TerminalMethode {
    public static void main(String[] args) {
        Stream<Integer> st = Stream.of(1, 2, 3, 4, 5, 6, 7);

        System.out.println(st.findAny());
        System.out.println(st.anyMatch(x -> x % 2 == 0));

    }
}
