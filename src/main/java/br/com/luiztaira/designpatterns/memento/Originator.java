package br.com.luiztaira.designpatterns.memento;

public class Originator {

    private String state;

    public void setState(String state){
        System.out.println("Change contract state to: " + state);
        this.state = state;
    }

    public Contract saveContract(){
        System.out.println("Saving contract in state: " + this.state);
        return new Contract(this.state);
    }

    public void restoreState(Contract contract){
        this.state = contract.getState();
        System.out.println("Contract state return to: " + contract.getState());
    }
}
