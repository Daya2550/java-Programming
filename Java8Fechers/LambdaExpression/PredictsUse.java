package LambdaExpression;

import java.util.function.Predicate;

public class PredictsUse {
    public static void main(String[] args) {
        // Take the input and give the boolean value output

        Predicate<Integer> p;
        p = x -> x % 2 == 0;

        System.out.println(p.test(5));
        System.out.println(p.test(6));

        // opposite the result of the predicate
        Predicate<Integer> n = p.negate();
        System.out.println(n.test(5));

        // And the result in that predicte
        Predicate<Integer> a = p.and(n);
        System.out.println(n.test(5));

        // Or the predicate in that case
        Predicate<Integer> o = p.or(a);
        System.out.println(n.test(5));

    }
}
