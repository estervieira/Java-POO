package DclassesUtilitarias.cDatasTest;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2001, Month.DECEMBER, 21, 12, 0,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println( ChronoUnit.DAYS.between(aniversario, now));
        System.out.println( ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println( ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println( ChronoUnit.YEARS.between(aniversario, now));
    }
}
