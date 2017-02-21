package br.com.luiztaira.designpatterns.chainOfResponsibility;

public class Order {

    private double price;

    public Order(double price) {
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
}
