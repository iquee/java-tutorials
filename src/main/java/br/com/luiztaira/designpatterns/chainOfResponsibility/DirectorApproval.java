package br.com.luiztaira.designpatterns.chainOfResponsibility;

public class DirectorApproval implements OrderApproval {

    OrderApproval nextToApproval;

    public String approval(Order order) {
        if (order.getPrice() <= 1000.00){
            return "Order approved by Director";
        } else{
            System.out.println("Order too expensive for Directors");
            return nextToApproval.approval(order);
        }
    }

    public void next(OrderApproval nextToApproval) {
        this.nextToApproval = nextToApproval;
    }
}
