package br.com.luiztaira.threads.module8;

/**
 * Test wow to catch an exception thrown by another thread in Java
 */
public class ThreadUncaughtExceptionHandler {

    public static void main(String[] args) {
        // create a uncaught exception handler
        Thread.UncaughtExceptionHandler handler = new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread th, Throwable ex) {
                System.out.println("Thread: " + th.getId());
                System.out.println("Do something...");
                System.out.println("Uncaught exception: " + ex);
            }
        };

        // create thread to throw an Exception
        Thread otherThread = new Thread() {
            public void run() {
                String s=  null;
                try {
                    s.length();
                } catch (NullPointerException e) {
                    System.out.println("Throwing NPE ...");
                    throw new NullPointerException();
                }
            }
        };

        // set our uncaught exception handler as the one to be used when the new thread
        otherThread.setUncaughtExceptionHandler(handler);

        // start the other thread - our uncaught exception handler will be invoked when the NPE occur
        otherThread.start();
    }

}
