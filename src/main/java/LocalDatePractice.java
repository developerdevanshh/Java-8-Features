import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.*;
public class LocalDatePractice {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2003,11,06);

        System.out.println("Today: " + today);
        System.out.println("Birthday: " + birthday);

        LocalDate nextWeek = today.plusDays(7);
        System.out.println("Next week: " + nextWeek);

        Period age = Period.between(birthday, today);
        System.out.println("Age: " + age.getYears() + " years");

        System.out.println("Day of week: " + today.getDayOfWeek());
    }
}
