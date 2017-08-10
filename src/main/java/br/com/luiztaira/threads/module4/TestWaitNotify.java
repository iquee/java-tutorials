package br.com.luiztaira.threads.module4;

public class TestWaitNotify {

    public static void main(String[] args) {
        Object obj = new Object();

        System.out.println("Threads started...\n");

        ProcessObject object1 = new ProcessObject(obj);
        new Thread(object1, "Object1").start();

        ProcessObject object2 = new ProcessObject(obj);
        new Thread(object2, "Object2").start();

        Notifier notifier = new Notifier(obj);
        new Thread(notifier, "Notification all objects").start();
    }
}
