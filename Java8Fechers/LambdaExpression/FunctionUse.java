package LambdaExpression;

import java.util.function.Function;

public class FunctionUse {
    public static void main(String[] args) {
        // IT take one input and get one output
        Function<Integer, Integer> f = x -> x + x;

        System.out.println(f.apply(10));

        Function<Integer, Integer> a = f.andThen(f);
        Function<Integer, Integer> o = f.compose(a);

    }
}
