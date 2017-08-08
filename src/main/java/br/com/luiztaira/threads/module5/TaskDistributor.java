package br.com.luiztaira.threads1.module5;

import java.net.Socket;

/**
 * Created by taira on 8/8/17.
 */
public class TaskDistributor implements Runnable {

    private Socket socket;

    public TaskDistributor(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("Distributing " + socket);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
