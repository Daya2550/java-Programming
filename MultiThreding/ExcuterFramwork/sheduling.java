package ExcuterFramwork;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class sheduling {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        // Strating the sheduling task after 1 secound and executing after every 2
        long start = System.currentTimeMillis();
        service.scheduleAtFixedRate(() -> {
            System.out.println("Task executed");

        }, 1, 1, TimeUnit.SECONDS);

        service.scheduleWithFixedDelay(() -> {
            System.out.println("Task executed");

        }, 1, 1, TimeUnit.SECONDS);

        // strating the sheduling task after 10 secound and executing after every 1
        // secound but is used to shutdown the service after 10 secound
        service.scheduleAtFixedRate(() -> {
            service.shutdown();
        }, 10, 1, TimeUnit.SECONDS);

        try {
            service.awaitTermination(1000, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - start);

    }
}
