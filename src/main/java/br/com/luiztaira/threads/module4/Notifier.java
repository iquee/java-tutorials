package br.com.luiztaira.threads.module4;

public class Notifier implements Runnable{

    private Object obj;

    public Notifier(Object obj) {
        this.obj = obj;
    }

    public void run() {
        String name = Thread.currentThread().getName();
        try {
            Thread.sleep(1000);
            synchronized (obj) {
                System.out.println("");
                System.out.println(name+" started");
                obj.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
