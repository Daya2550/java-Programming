package ThreadComunication;

public class main {

    public static void main(String[] args) {
        worek w = new worek();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                w.producer();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                w.consumer();
            }
        });
        t1.start();
        t2.start();

    }
}

class worek {

    volatile boolean flag = false;

    public synchronized void producer() {
        while (flag) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println("producer is producing");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        flag = true;
        notify();
        System.out.println("producer is done");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public synchronized void consumer() {
        while (!flag) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println("consumer is consuming");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        flag = false;
        notify();
        System.out.println("consumer is done");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}