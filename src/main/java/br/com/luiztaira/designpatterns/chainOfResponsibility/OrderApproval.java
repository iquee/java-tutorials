package br.com.luiztaira.designpatterns.chainOfResponsibility;

public interface OrderApproval {

    public String approval(Order order);
    public void next(OrderApproval orderApproval);
}
