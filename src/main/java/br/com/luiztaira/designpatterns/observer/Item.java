package br.com.luiztaira.designpatterns.observer;

public class Item {

    private String name;
    private int amount;

    public Item(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
