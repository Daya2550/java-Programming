package Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockChaning {

    private final Lock l = new ReentrantLock();

    public void method1() {
        l.lock();
        System.out.println("Method 1");
        method2();
        l.unlock();
    }

    public void method2() {
        l.lock();
        System.out.println("Method 2");
        method3();
        l.unlock();
    }

    public void method3() {
        l.lock();
        System.out.println("Method 3");
        l.unlock();
    }
}
