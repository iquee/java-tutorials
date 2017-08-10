package br.com.luiztaira.threads.module5;

import java.net.Socket;
import java.util.Scanner;

/**
 * Created by taira on 8/8/17.
 */
public class TaskDistributor implements Runnable {

    private Socket socket;
    private int number;

    public TaskDistributor(Socket socket, int number){
        this.number = number;
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.println("    Distributing " +number+ " - " + socket);
            Scanner in = new Scanner(socket.getInputStream());

            while (in.hasNextLine())
                System.out.println("    " + in.nextLine());

            Thread.sleep(2000);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
