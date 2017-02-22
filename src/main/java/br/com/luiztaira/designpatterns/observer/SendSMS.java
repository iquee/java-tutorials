package br.com.luiztaira.designpatterns.observer;

public class SendSMS implements AfterAction {
    public void execute(PaymentReceipt receipt) {
        System.out.println("Send SMS to customer...");
    }
}
