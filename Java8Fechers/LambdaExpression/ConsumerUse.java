package LambdaExpression;

import java.util.function.Consumer;

public class ConsumerUse {

    public static void main(String[] args) {
        // Take input but not return any thing
        Consumer<Integer> c = x -> System.out.println(x);

        c.accept(10);
    }
}
