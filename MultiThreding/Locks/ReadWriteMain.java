package Locks;

public class ReadWriteMain {
    public static void main(String[] args) {
        ReadWriteLock rw = new ReadWriteLock();

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            rw.read();
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            rw.write();
        });

        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            rw.read();
        });

        Thread t4 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            rw.write();
        });

        Thread t5 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            rw.read();
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
