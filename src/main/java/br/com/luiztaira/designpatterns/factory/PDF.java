package br.com.luiztaira.designpatterns.factory;

public class PDF implements Document {
    public void createDocument() {
        System.out.println("Create a PDF document...");
    }
}
