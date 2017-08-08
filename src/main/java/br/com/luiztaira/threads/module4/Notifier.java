package br.com.luiztaira.threads1.module4;

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
                System.out.println("\n" + name+" started\n");
                obj.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
