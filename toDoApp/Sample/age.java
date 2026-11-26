import java.time.LocalDate;
import java.time.Period;

public class age {
    public static int calAge(LocalDate currentime, LocalDate birthDate) {
        return Math.abs(Period.between(birthDate, currentime).getYears());
    }
    public static void main(String[] args) {
        LocalDate bd = LocalDate.of(2004, 9, 24);
        LocalDate now = LocalDate.now();
        System.out.println(calAge(bd, now));
    }
}
