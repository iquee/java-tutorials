package br.com.luiztaira.threads.module1;

public class SingleThread implements Runnable {

    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getId() +  " - "  + i);
        }
    }

    public static void main(String[] args) {
        new Thread(new SingleThread()).start();
        new Thread(new SingleThread()).start();
    }
}
