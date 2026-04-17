package ThredingUse;

public class UsingThred {

    public static void main(String[] args) {
        // 1 . To creating new thread by using anther class , extending the by Thread
        werk w = new werk();
        w.start();

        // 2. To creating new Thread by using the anonymous class
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Task running innner class");
            }
        });
        t2.start();

        // 3. To creating new Thread by using the lambda expression
        Thread t3 = new Thread(() -> {
            System.out.println("Task running lambda Expression");
        });
        t3.start();
    }
}

class werk extends Thread {
    public void run() {
        System.out.println("Task running at class");
    }
}