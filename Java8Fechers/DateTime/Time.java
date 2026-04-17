package DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalTime of = LocalTime.of(1, 34);
        System.out.println(of);

        Duration d = Duration.between(t, of);
        System.out.println(d);
    }
}
