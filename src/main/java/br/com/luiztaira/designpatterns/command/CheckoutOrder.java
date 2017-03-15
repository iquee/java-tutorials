package br.com.luiztaira.designpatterns.command;

public class CheckoutOrder implements Command {

    private StoreOrder order;

    public CheckoutOrder(StoreOrder order) {
        this.order = order;
    }

    public void execute() {
        System.out.println("checking out: " + order.getCustomer());
        this.order.checkout();
    }
}
