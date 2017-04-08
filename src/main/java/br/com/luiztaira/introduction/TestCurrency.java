package br.com.luiztaira.introduction;

import java.text.NumberFormat;
import java.util.Locale;

public class TestCurrency {

    public static void main(String[] args) {
        double price = 12324.134;
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(price));

        Locale india =  new Locale("en", "IN");
        System.out.println("India: " + NumberFormat.getCurrencyInstance(india). format(price));

        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(price));

        Locale brazil = new Locale("pt", "Br");
        System.out.println("Brazil: " + NumberFormat.getCurrencyInstance(brazil).format(price));

    }
}
