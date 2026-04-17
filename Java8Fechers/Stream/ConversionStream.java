package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConversionStream {
    public static void main(String[] args) {

        // Other to Stream
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(list.stream().toList());

        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        int b[] = (Arrays.stream(a).toArray());
        System.out.println(Arrays.toString(b));

        System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7).toList());

        // stream to other
        Stream<Integer> st = Stream.of(1, 2, 3, 4, 5, 6, 7);

        Object arr[] = st.toArray();

        List<Integer> list2 = st.toList();

        ArrayList<Integer> arlist = st.collect(Collectors.toCollection(ArrayList::new));
        TreeSet<Integer> tset = st.collect(Collectors.toCollection(TreeSet::new));

    }
}
