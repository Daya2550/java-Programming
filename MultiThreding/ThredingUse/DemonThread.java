package ThredingUse;

public class DemonThread {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Task 1");
        });
        t1.setDaemon(true);
        t1.start();
        System.out.println(t1.isDaemon());

    }
}
