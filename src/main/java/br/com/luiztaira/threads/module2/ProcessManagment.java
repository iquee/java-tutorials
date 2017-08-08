package br.com.luiztaira.threads1.module2;

public class ProcessManagment {

    public void processOrderToBuy(){
        String name = Thread.currentThread().getName();

        synchronized (this){
            System.out.println("1 "  + name + " - order received");
            System.out.println("2 " + name + " - buying product");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("3 " + name + " - product bought");
        }
    }

    public void processOrderToDelivery(){
        String name = Thread.currentThread().getName();

        synchronized (this){
            System.out.println("4 " + name + " - product received");
            System.out.println("5 "  + name + " - delivering product");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("6 " + name + " - product delivered");
        }
    }
}
