package br.com.luiztaira.threads1.module5;

import java.net.Socket;
import java.util.Scanner;

/**
 * Created by taira on 8/7/17.
 */
public class TaskClient {

    public static void main(String[] args) throws Exception{
        System.out.println("Trying connection...");
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Connection established!");
        System.out.println("do something....");
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
        //socket.close();
        //System.out.println("Socket close: client");
    }
}
