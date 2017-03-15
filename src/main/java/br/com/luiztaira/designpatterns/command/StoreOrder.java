package br.com.luiztaira.designpatterns.command;

public class StoreOrder {

    private String customer;
    private double price;
    private OrderStatus status;

    StoreOrder(String customer, double price, OrderStatus status) {
        this.customer = customer;
        this.price = price;
        this.status = status;
    }

    public void checkout(){
        status = OrderStatus.PAIDOUT;
    }

    public void done(){
        status = OrderStatus.FINALIZED;
    }

    public void startNewOrder(){
        status = OrderStatus.NEW;
    }


    public String getCustomer() {
        return this.customer;
    }
}
