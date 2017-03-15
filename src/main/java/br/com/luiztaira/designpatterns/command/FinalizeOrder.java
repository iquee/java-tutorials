package br.com.luiztaira.designpatterns.command;

public class FinalizeOrder implements Command {

    private StoreOrder order;

    public FinalizeOrder(StoreOrder order) {
        this.order = order;
    }

    public void execute() {
        System.out.println("finalizing order " + order.getCustomer());
        this.order.done();
    }
}
