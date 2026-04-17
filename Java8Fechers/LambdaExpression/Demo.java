package LambdaExpression;

public class Demo {

    /*
     * lambda Expression are used with the functional Interface .
     * It can be used for the minimizing the code and make the more redable and
     * efficient code
     * It is the function internally to be implimenting the function interface
     * methode
     * Inside the methode all the veriable are the final veriables .
     * syntax - ( ) -> { }
     * 
     */

    /*
     * Function Interface have only one abstract methode but mony defoult and static
     * methodes .
     * when defoult methode conflict ocuures thean orriverding the the methode .
     * sttaic metodes can be acceesed by the class name only
     */

    public static void main(String[] args) {

        // Using the Anonymus innner class implimentation
        A a = new A() {
            @Override
            public void show() {
                System.out.println("hi");
            }
        };
        a.show();

        // Using the lambda Implimentaion

        A b = () -> System.out.println("Lambda Implimentation !");
        b.show();

    }
}

// Function interface is the interface it can have only one methode
@FunctionalInterface
interface A {
    public void show();

}
