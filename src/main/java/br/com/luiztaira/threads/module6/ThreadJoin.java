package br.com.luiztaira.threads.module6;

/**
 *
 */
public class ThreadJoin {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Starting Thread y");

        Thread y = new Thread(new Runnable () {
            public void run() {
                new PrintNumbers().run();
            }
        });
        y.start(); // starting Thread y
        y.join(10000);  // waiting y to end or start after 10 seconds

        System.out.println("------------------");
        System.out.println("Starting Thread t1");
        new Thread(new PrintNumbers(), "t1").start();
    }
}
