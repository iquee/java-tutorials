package br.com.luiztaira.threads1.module2;

public class ProcessToBuy implements Runnable {
    private ProcessManagment pm;

    public ProcessToBuy(ProcessManagment pm){
        this.pm = pm;
    }

    public void run(){
        pm.processOrderToBuy();
    }
}
