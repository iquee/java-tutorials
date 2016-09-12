package br.com.luiztaira.introduction;

import java.util.Calendar;

public class TestFormatter {

    public static void main(String[] args) {

        // %[argument_index$][flags][width][.precision]conversion

        System.out.println("Calendar manipulate:");
        // ex.: %1$tH, where:
        // 1$ position of the argument in argument list
        // tH set of characters that modify the output format
        System.out.printf("%1$tH:%1$tM %1$td %1$tb %1$tY", Calendar.getInstance());

        // n, print new line
        System.out.printf("%n%n");

        System.out.println("String & Integer manipulate:");
        // ex.: %1$-10s, where
        // 1$ position of the argument in argument list. In this case: "value"
        // -   left align
        // 10s string minimum field width
        //
        // ex.: %2$05d, where
        // 2$ position of the argument in argument list. In this case: 100
        // 0   insert extra 0, if necessary, in the integer
        // 5d  integer minimum field width
        System.out.printf("%1$-10s %2$05d", "value", 100);
    }

}
