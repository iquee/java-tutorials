package br.com.luiztaira.threads.module6;

/**
 * Single Thread that print
 */
public class PrintNumbers implements Runnable {
    private Integer n;

    public PrintNumbers(Integer n){
        this.n = n;
    }

    @Override
    public void run() {
        //for (int i = 0; i < Integer.MAX_VALUE; i++)
        for (int i = 0; i < n; i++)
            System.out.println("Thread: " +   Thread.currentThread().getName() +  " || Print: " + i);
    }
}
