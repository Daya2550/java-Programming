package LambdaExpression;

import java.util.function.Supplier;

public class SupplierUse {

    public static void main(String[] args) {
        // Not take any input put creating the output
        Supplier<Integer> s = () -> 1;
        System.out.println(s.get());

    }
}
