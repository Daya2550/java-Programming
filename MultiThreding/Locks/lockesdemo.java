package Locks;

import java.util.concurrent.locks.ReentrantLock;

public class lockesdemo {

    public static void main(String[] args) {
        Banck b = new Banck();

        Runnable r = () -> {
            b.withdraw(100);
            b.withdraw(100);
            b.withdraw(100);
            b.withdraw(100);
        };

        Thread t1 = new Thread(r, "Firest Thread ");
        Thread t2 = new Thread(r, "Second Thread ");

        t1.start();
        t2.start();
    }
}
