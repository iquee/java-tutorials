package br.com.luiztaira.designpatterns.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class DoOrder {

    List<AfterAction> actions = new ArrayList<AfterAction>();

    public void addNewAction(AfterAction action){
        this.actions.add(action);
    }

    public void checkout(){
        PaymentReceipt receipt = new PaymentReceipt(
                100.00,
                Arrays.asList(new Item("coke", 2), new Item("meal", 4)),
                Calendar.getInstance()
        );

        for (AfterAction action: actions) {
            action.execute(receipt);
        }

        System.out.println("------");
        System.out.println(receipt);
    }
}
