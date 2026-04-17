package Syncronization;

public class TouseSycronization {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (counter) {
                    counter.increment();
                }

            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (counter) {
                    counter.increment();
                }

            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter Value: " + counter.getValue());
    }
}

class Counter {

    int counter = 0;

    public void increment() {
        int temp = counter;
        temp = temp + 1;
        try {
            Thread.sleep(0, 1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter = temp;
    }

    public int getValue() {
        return counter;
    }
}