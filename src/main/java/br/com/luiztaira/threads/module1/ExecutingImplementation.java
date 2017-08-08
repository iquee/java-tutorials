package br.com.luiztaira.threads1.module1;

/**
 * Sample code of Thread implements Runnable interface
 * Pay attention that the output is not in order
 */
public class ExecutingImplementation implements Runnable{
    
    private int i = 0;

    @Override
    public void run() {
        System.out.println("number: " + i++);
    }

    public static void main(String[] args) {
        ExecutingImplementation exi = new ExecutingImplementation();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(exi);
            System.out.println("new thread created..");
            t.start();
        }
    }
}
