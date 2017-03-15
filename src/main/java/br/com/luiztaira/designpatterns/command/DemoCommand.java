package br.com.luiztaira.designpatterns.command;

public class DemoCommand {

    public static void main(String[] args) {

        StoreOrder order1 = new StoreOrder(
                "larry.page",
                100.00,
                OrderStatus.NEW
        );

        StoreOrder order2 = new StoreOrder(
                "jeff.bezos",
                90.00,
                OrderStatus.NEW
        );

        OrderQueue orderQueue = new OrderQueue();
        orderQueue.addCommand(new CheckoutOrder(order1));
        orderQueue.addCommand(new CheckoutOrder(order2));
        orderQueue.addCommand(new FinalizeOrder(order1));

        orderQueue.process();

    }
}
