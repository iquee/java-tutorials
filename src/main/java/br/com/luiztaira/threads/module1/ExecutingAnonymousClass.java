package br.com.luiztaira.threads.module1;

/**
 * Thread being executed by an anonymous class.
 * In this way, is harder to understand when an exception is thrown
 */
public class ExecutingAnonymousClass {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous...");
            }
        }).start();

    }
}
