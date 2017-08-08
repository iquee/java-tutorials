package br.com.luiztaira.threads1.module2;

public class BuyingProducts {

    public static void main(String[] args) {
        String car = "honda";

        ProcessManagment pm = new ProcessManagment();

        new Thread(new ProcessToBuy(pm), car).start();
        new Thread(new ProcessToDelivery(pm), car).start();
    }

}
