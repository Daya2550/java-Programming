package LambdaExpression;

public class ThredingUsingLambda {

    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("ok task done !");
        }).start();

        Runnable r = () -> {
            System.out.println("Runable !");
        };
        Thread t2 = new Thread(r);
        t2.start();

    }
}
