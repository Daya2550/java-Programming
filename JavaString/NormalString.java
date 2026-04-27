package JavaString;

import java.util.stream.IntStream;

public class NormalString {
    public static void main(String[] args) {

        String s = "Hello"; // String using the litral . It can be in the string pool . it is inmutable
        String s2 = new String("hello"); // using string class . It can be stoverd in heap created new refffrence or
                                         // adress

        String substring = s.substring(1, 3); // It can return the new string not changed the main string

        // String all The methodes :

        char charAt = s.charAt(1);
        String substring2 = s.substring(1, 4);
        CharSequence subSequence = s.subSequence(1, 3);
        boolean contains = s.contains("h");
        String concat = s.concat("w");
        boolean equals = s.equals(s2);
        int indexOf = s.indexOf("h");
        boolean blank = s.isBlank();
        boolean empty = s.isEmpty();
        boolean startsWith = s.startsWith("h");
        boolean endsWith = s.endsWith("o");
        String[] split = s.split("");
        int length = s.length();
        String replace = s.replace("h", "H");
        String trim = s.trim();
        String strip = s.strip();

        String indent = s.indent(2); // ading the space before the string

        String intern = s.intern();

        String join = s.join(" ", "daya", "hi");
        System.out.println(join);

    }
}
