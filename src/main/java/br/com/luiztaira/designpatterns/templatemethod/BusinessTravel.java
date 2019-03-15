package br.com.luiztaira.designpatterns.templatemethod;

import java.util.Scanner;

public class BusinessTravel extends Process {

    String name = "";
    String travelTo = "";

    public void initialize() {
        System.out.println("Initializing process to request a business travel");
    }

    public void fillForm() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type your name: ");
        this.name = scan.next();
        System.out.println("travel to: ");
        this.travelTo = scan.next();
    }

    public void finalize() {
        System.out.println("Hi " + this.name + ". The ticket to " + this.travelTo + " was booked.");
        System.out.println("Process finalized");
    }

    @Override
    public void startProcess() {
        super.startProcess();
    }
}
