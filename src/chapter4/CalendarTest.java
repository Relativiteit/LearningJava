package chapter4;
import java.time.*;
// check OCA book for principles on object creation and initialization
// dependce, inheritance, aggregation
public class CalendarTest {
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today -1); // set to start of month
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday, .... ,

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for ( int i = 1l; i < valuel; i++)
            System.out.println("   ");
        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDay)
        }
    }
}
