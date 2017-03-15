package br.com.luiztaira.designpatterns.adapter;

public class DemoAdapter {

    public static void main(String[] args) {
        DefaultWatch watch = new WatchUsingCalendar();
        System.out.println(watch.today());
    }
}
