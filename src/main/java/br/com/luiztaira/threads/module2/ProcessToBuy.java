package br.com.luiztaira.threads.module2;

public class ProcessToBuy implements Runnable {
    private ProcessManagment pm;

    public ProcessToBuy(ProcessManagment pm){
        this.pm = pm;
    }

    public void run(){
        pm.processOrderToBuy();
    }
}
