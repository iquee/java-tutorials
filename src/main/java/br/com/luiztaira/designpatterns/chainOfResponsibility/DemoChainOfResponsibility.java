package br.com.luiztaira.designpatterns.chainOfResponsibility;

public class DemoChainOfResponsibility {

    public static void main(String[] args) {

        ManagerApproval manager = new ManagerApproval();
        DirectorApproval director = new DirectorApproval();
        NoPermissionToApproval noPermission = new NoPermissionToApproval();

        manager.next(director);
        director.next(noPermission);

        Order order =
                //new Order(450.00);
                //new Order(550.00); // directors
                new Order(1200.00); //no one

        System.out.println("Order price: " + order.getPrice() + "\n");
        System.out.println(manager.approval(order));
    }
}
