package Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banck {
    private int balance = 1000;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        boolean isLockAcquired = false;

        System.out.println(Thread.currentThread().getName() + " is trying to acquire the lock");

        try {
            isLockAcquired = lock.tryLock(3, TimeUnit.SECONDS);

            if (!isLockAcquired) {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock");
                return;
            }

            System.out.println(Thread.currentThread().getName() + " has acquired the lock");

            if (balance < amount) {
                System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);

                Thread.sleep(3000); // simulate delay
                System.out.println("Insufficient balance");
            } else {
                Thread.sleep(3000); // simulate processing

                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew " + amount + " successfully");
                System.out.println("Remaining balance: " + balance);
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
            System.out.println("Thread interrupted");
        } finally {
            if (isLockAcquired) {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + " has released the lock");
            }
        }
    }
}