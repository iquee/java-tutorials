package br.com.luiztaira.designpatterns.state;

/**
 * Created by Ique on 19/02/17.
 */
public class Contexto {

    private State state;

    public Contexto() {
        this.state = null;
    }

    public State getState(){
        return this.state;
    }

    public void setState(State state){
        this.state = state;
    }
}
