package br.com.luiztaira.introduction;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {

    public static void main(String[] args) {

        String month = "04";
        String day = "05";
        String year = "2017";

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Calendar cal = new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
        System.out.println(sdf.format(cal.getTime()).toUpperCase());
    }

}
