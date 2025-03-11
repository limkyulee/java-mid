package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {
    public static void main(String[] args) {
        ChronoField[] values = ChronoField.values();
        for (ChronoField field : values) {
            System.out.println("field : " + field + " | " + field.range());
        }

        System.out.println("MONTH_OF_YEAR.range() : " + ChronoField.MONTH_OF_YEAR.range());
        System.out.println("DAY_OF_MONTH.range() : " + ChronoField.DAY_OF_MONTH.range());
    }
}
