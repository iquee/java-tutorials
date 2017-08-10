package br.com.luiztaira.threads.module2;

public class ProcessToDelivery implements Runnable{
    private ProcessManagment pm;

    public ProcessToDelivery(ProcessManagment pm) {
        this.pm = pm;
    }

    public void run() {
        pm.processOrderToDelivery();
    }
}
