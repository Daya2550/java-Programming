package JavaString;

public class Stringbulder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello"); // It is faster , mutable , heap memery use but not thred safe

        s.append(" world !"); // the main string is affected or updated . making the same string opration
                              // directly .
        System.out.println(s.toString());

        String newString = s.toString(); // Coverting into normal String

    }
}
