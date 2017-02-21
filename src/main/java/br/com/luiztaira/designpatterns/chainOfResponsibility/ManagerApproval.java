package br.com.luiztaira.designpatterns.chainOfResponsibility;

public class ManagerApproval implements OrderApproval {

    private OrderApproval nextToApproval;

    public String approval(Order order) {
        if (order.getPrice() <= 500.00){
            return "Order approved by Manager";
        } else{
            System.out.println("Order too expensive for Managers");
            return nextToApproval.approval(order);
        }
    }

    public void next(OrderApproval nextToApproval) {
        this.nextToApproval = nextToApproval;
    }
}
