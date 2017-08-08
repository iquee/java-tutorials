package br.com.luiztaira.threads1.module2;

public class ProcessToDelivery implements Runnable{
    private ProcessManagment pm;

    public ProcessToDelivery(ProcessManagment pm) {
        this.pm = pm;
    }

    public void run() {
        pm.processOrderToDelivery();
    }
}
