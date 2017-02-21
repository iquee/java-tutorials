package br.com.luiztaira.designpatterns.chainOfResponsibility;

public class NoPermissionToApproval implements OrderApproval {

    public String approval(Order order) {
        return "Order too expensive to approval";
    }

    public void next(OrderApproval orderApproval) {
        // no more agents ro approval this order
    }
}
