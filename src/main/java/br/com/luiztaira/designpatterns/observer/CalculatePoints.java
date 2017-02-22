package br.com.luiztaira.designpatterns.observer;

public class CalculatePoints implements AfterAction{
    public void execute(PaymentReceipt receipt) {
        System.out.println("Calculating points of " + receipt.getValue());
    }
}
