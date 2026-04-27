package ThredingUse;

import java.util.concurrent.*;

public class UsingCallable {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 1. Using class
        Werk w = new Werk();
        Future<Integer> f1 = executor.submit(w);

        // 2. Using anonymous class
        Future<Integer> f2 = executor.submit(new Callable<Integer>() {
            public Integer call() {
                return 2;
            }
        });

      

        // 3. Using lambda
        Future<Integer> f3 = executor.submit(() -> 3);

        // Get results
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());

        executor.shutdown();
    }
}

class Werk implements Callable<Integer> {
    public Integer call() {
        return 1;
    }
}