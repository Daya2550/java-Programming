package Syncronization;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class TouseManualockes {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        ReentrantReadWriteLock rw = new ReentrantReadWriteLock();
        WriteLock write = rw.writeLock();
        ReadLock read = rw.readLock();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                try {

                    if (write.tryLock(10, TimeUnit.SECONDS)) {
                        System.out.println(Thread.currentThread().getName());
                        counter.increment();
                        write.unlock();
                    }
                    if (read.tryLock(10, TimeUnit.SECONDS)) {
                        System.out.println(Thread.currentThread().getName());
                        System.out.println(counter.getValue());
                        read.unlock();
                    }
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }, "Firest");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                try {
                    if (write.tryLock(10, TimeUnit.SECONDS)) {
                        System.out.println(Thread.currentThread().getName());
                        counter.increment();
                        write.unlock();
                        if (read.tryLock(10, TimeUnit.SECONDS)) {
                            System.out.println(Thread.currentThread().getName());
                            System.out.println(counter.getValue());
                            read.unlock();
                        }
                    }
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }, "Second");

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