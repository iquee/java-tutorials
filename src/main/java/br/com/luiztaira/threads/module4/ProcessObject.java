package br.com.luiztaira.threads1.module4;

public class ProcessObject implements Runnable{
    private Object obj;

    public ProcessObject(Object obj){
        this.obj=obj;
    }

    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (obj) {
            try{
                Thread.sleep(500);
                System.out.println("Waiting notify to process the object: " + name + " || " +System.currentTimeMillis());
                obj.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name+ " received the notification || "+System.currentTimeMillis());
            //processing the object
            System.out.println("Processing " + name  +"\n");
        }
    }
}
