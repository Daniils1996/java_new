import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1996, 9, 29);
        int years = Period.between(birthday, today).getYears();
        int days = Period.between(birthday, today).getDays();

        System.out.println(today);
        System.out.println(birthday);
        System.out.println(years);
        System.out.println(days);
    }
}