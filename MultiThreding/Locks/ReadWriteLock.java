package Locks;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class ReadWriteLock {
    private final ReentrantReadWriteLock rw = new ReentrantReadWriteLock();
    WriteLock write = rw.writeLock();
    ReadLock read = rw.readLock();

    public void read() {
        read.lock();
        System.out.println("Reading");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        read.unlock();
    }

    public void write() {
        write.lock();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Writing");
        write.unlock();
    }

}
