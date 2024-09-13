package DataTypesandvariabales;

public class casting {
    public static void main(String[] args) {
             // Widening Casting (automatically) - converting a smaller type to a larger type size
            // byte -> short -> char -> int -> long -> float -> double
            // Narrowing Casting (manually) - converting a larger type to a smaller size type
            // double -> float -> long -> int -> char -> short -> byte
            float f=5.55f;
            int i=5;
            System.out.println(0.0+ i);//auto
            System.out.println((int)f);//manually
            
    }
}
