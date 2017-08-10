package br.com.luiztaira.threads.module6;

public class PrintNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++)
            System.out.println("Thread: " +   Thread.currentThread().getName() +  " - Print: " + i);
    }
}
