package br.com.luiztaira.designpatterns.adapter;

import java.util.Calendar;

public class WatchUsingCalendar implements DefaultWatch{
    public Calendar today() {
        return Calendar.getInstance();
    }
}
