package ThredingUse;

public class UsingRunnable {
    public static void main(String[] args) {
        // Using the class
        werk w = new werk();
        Thread t = new Thread(w);
        t.start();

        // Using the anonymous class
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Task running inner class");
            }
        });
        t2.start();

        // Using the lambda expression
        Thread t3 = new Thread(() -> {
            System.out.println("Task running lambda expression");
        });
        t3.start();
    }

}

class werk implements Runnable {
    public void run() {
        System.out.println("Task running at class");
    }
}
