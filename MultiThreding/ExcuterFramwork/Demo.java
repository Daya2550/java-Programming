package ExcuterFramwork;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Integer> f = null;
        for (int i = 0; i < 10; i++) {
            int finali = i;
            f = service.submit(() -> {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                System.out.println("Task " + finali);
                return finali;
            });
        }
        service.shutdown();
        try {
            f.get();

        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("All tasks completed");
    }
}
