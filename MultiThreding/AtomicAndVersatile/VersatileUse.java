package AtomicAndVersatile;

import java.util.concurrent.CountDownLatch;

public class VersatileUse {

    public static void main(String[] args) {

        StatusFlag flag = new StatusFlag();

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

class StatusFlag {

    // use of the versatile key wored used hear to gettting the updated value only
    // not old one
    volatile boolean b = false;

    public void setFlag() {
        b = true;

        System.out.println("Flag updated to true");
    }

    public void readFlag() {
        System.out.println("Reding is going on !");
        while (!b) {

        }

    }

}
