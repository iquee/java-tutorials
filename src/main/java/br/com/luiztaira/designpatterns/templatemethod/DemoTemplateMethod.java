package br.com.luiztaira.designpatterns.templatemethod;

public class DemoTemplateMethod {

    public static void main(String[] args) {
        BuyItem item = new BuyItem();
        item.startProcess();

        System.out.println("--------------");

        BusinessTravel bt = new BusinessTravel();
        bt.startProcess();
    }

}
