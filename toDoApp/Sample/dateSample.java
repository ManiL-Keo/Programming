import java.time.LocalDate;
import java.time.Instant;

public class dateSample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Instant now = Instant.now();

        System.out.println(today);
        System.out.println(now);

        LocalDate deadline = LocalDate.of(2026, 10, 17);
        System.out.println(deadline);
        System.out.println(deadline.plusDays(3));
        System.out.println(deadline.isEqual(today));
        System.out.println(deadline.isAfter(today));
        System.out.println(deadline.isBefore(today));
    }
}
