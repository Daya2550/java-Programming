package Locks;

public class chainmain {
    public static void main(String[] args) {
        LockChaning lc = new LockChaning();

        Thread t1 = new Thread(() -> {
            lc.method1();
        });

        Thread t2 = new Thread(() -> {
            lc.method2();
        });

        Thread t3 = new Thread(() -> {
            lc.method3();
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
