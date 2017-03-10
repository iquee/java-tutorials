package br.com.luiztaira.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Timeline {

    private List<Contract> contractStates = new ArrayList<Contract>();

    public void addContract(Contract contract){
        System.out.println("Contract stored in postion: " + contractStates.size());
        contractStates.add(contract);
    }

    public Contract getContract(int index){
        return this.contractStates.get(index);
    }
}
