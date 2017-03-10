package br.com.luiztaira.designpatterns.memento;

public class Contract {

    private String state;

    public Contract(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
