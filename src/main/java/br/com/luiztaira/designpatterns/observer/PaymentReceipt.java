package br.com.luiztaira.designpatterns.observer;

import java.util.Calendar;
import java.util.List;

public class PaymentReceipt {

    private double value;
    private List<Item> items;
    private Calendar calendar;

    public PaymentReceipt(double value, List<Item> items, Calendar calendar) {
        this.value = value;
        this.items = items;
        this.calendar = calendar;
    }

    public double getValue() {
        return value;
    }

    public List<Item> getItems() {
        return items;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    @Override
    public String toString() {
        return "PaymentReceipt{" +
                "value=" + value +
                ", items=" + items +
                ", calendar=" + calendar +
                '}';
    }
}
