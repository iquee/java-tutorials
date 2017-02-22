package br.com.luiztaira.designpatterns.observer;


public class DemoObserver {

    public static void main(String[] args) {

        DoOrder order = new DoOrder();
        System.out.println("Extra actions before show the payment receipt");
        order.addNewAction(new SendSMS());
        order.addNewAction(new CalculatePoints());

        order.checkout();
    }

}
