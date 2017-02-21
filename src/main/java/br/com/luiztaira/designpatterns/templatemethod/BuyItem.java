package br.com.luiztaira.designpatterns.templatemethod;

import java.util.Scanner;

public class BuyItem extends Process {

    String name = "";
    String itemToBuy = "";

    public void initialize(){
        System.out.println("Initializing process to buy an item");
    }

    public void fillForm() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type your name: ");
        this.name = scan.next();
        System.out.println("item to buy: ");
        this.itemToBuy = scan.next();
    }

    public void finalize() {
        System.out.println("Hi " + this.name + ". The item " + this.itemToBuy + " was buyed.");
        System.out.println("Process finalized");
    }

    @Override
    public void startProcess() {
        super.startProcess();
    }
}
