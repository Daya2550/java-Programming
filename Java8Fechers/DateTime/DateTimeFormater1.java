package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormater1 {
    public static void main(String[] args) {
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate now = LocalDate.now();

        System.out.println(now.format(ofPattern));

    }
}
