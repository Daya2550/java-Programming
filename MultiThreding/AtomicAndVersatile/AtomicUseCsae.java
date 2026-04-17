package AtomicAndVersatile;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicUseCsae {
    public static void main(String[] args) {

        AStatusFlag flag = new AStatusFlag();

        // Thread 1: waits until flag becomes true
        Thread reader = new Thread(() -> {
            flag.readFlag();
            System.out.println("Read is complited !");
        });

        // Thread 2: updates the flag after delay
        Thread writer = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag.setFlag();
            System.out.println("writing is complited !");

        });

        reader.start();
        writer.start();
    }
}

class AStatusFlag {

    AtomicInteger in = new AtomicInteger();

    public void setFlag() {
        System.out.println("Writing is going on !");
        System.out.println(in.incrementAndGet());
    }

    public void readFlag() {
        System.out.println("Reding is going on !");

        while (in.get() != 1) {

        }
        System.out.println(in.get());

    }

}
