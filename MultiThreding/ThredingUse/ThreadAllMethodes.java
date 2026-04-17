package ThredingUse;

public class ThreadAllMethodes {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("hi my task");
        });

        t.start();
        t.setPriority(10);
        System.out.println(t.getPriority());
        System.out.println(t.getState());
        System.out.println(t.isAlive());
        System.out.println(t.isDaemon());
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getThreadGroup());
        System.out.println(t.getUncaughtExceptionHandler());
    }

}
