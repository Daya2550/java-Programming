package DateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Data {
    public static void main(String[] args) {
        // Geting the date
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate of = LocalDate.of(2026, 10, 15);
        System.out.println(of);

        Period p = Period.between(now, of);
        System.out.println(p);
    }
}
