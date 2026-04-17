package ExcuterFramwork;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AllAtOne {
    public static void main(String[] args) {
        Executor ex = (Executor) Executors.newCachedThreadPool();

        // user can use two thred parllel and reuse them
        ExecutorService service = Executors.newFixedThreadPool(2);

        // It can get the Dynamically thredds and use it parllel
        ExecutorService service2 = Executors.newCachedThreadPool();

        // use only one thread at time
        ExecutorService service3 = Executors.newSingleThreadExecutor();

        // the the thred as per the sheduling the thred as the given
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);

        // Using the future all the methodes
        Future<Integer> f = service.submit(() -> {
            return 1;
        });

        newScheduledThreadPool.schedule(() -> {
            return 1;
        }, 1, TimeUnit.SECONDS);

        try {
            int a = f.get();
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        f.isDone();
        f.cancel(true);
        f.isCancelled();

        // all the service methodes

        service.shutdown();
        service.shutdownNow();
        service.isShutdown();
        service.isTerminated();
        try {
            service.awaitTermination(1000, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            service.invokeAny(null);
            service.invokeAll(null);
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
