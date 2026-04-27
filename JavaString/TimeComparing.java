package JavaString;

public class TimeComparing {
    public static void main(String[] args) {
        long old = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s = s + "D";
        }
        System.out.println(System.currentTimeMillis() - old);

        long old2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("D");
        }
        System.out.println(System.currentTimeMillis() - old2);

        long old3 = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            sbf.append("D");
        }
        System.out.println(System.currentTimeMillis() - old3);
    }
}
