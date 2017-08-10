package br.com.luiztaira.threads.module1;

/**
 * Sample code of Thread extends Thread class
 * Pay attention that the output is not in order
 */
public class ExecutingExtending extends Thread {

    private int i = 0;

    @Override
    public void run() {
        System.out.println("number: " + i++);
    }

    public static void main(String[] args) {
        ExecutingExtending exe = new ExecutingExtending();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(exe);
            System.out.println("new thread created..");
            t.start();
        }
    }
}
