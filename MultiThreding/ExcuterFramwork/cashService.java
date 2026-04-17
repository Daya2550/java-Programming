package ExcuterFramwork;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class cashService {
    public static void main(String[] args) {

        // parraller threding are used at once for processsing the task
        Thread[] t = new Thread[10];
        for (int i = 0; i < 10; i++) {
            int finali = i;
            t[finali] = new Thread(() -> {
                try {
                    Thread.sleep(1000);

                } catch (Exception e) {
                    // TODO: handle exception
                }
                System.out.println("main " + finali);
            });
            t[finali].start();

        }

        for (Thread t1 : t) {
            try {
                t1.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        // paraalller task can be compliting at one time use dynamcilly created the
        // threding .

        ExecutorService service = Executors.newCachedThreadPool();
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
