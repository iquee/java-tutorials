package br.com.luiztaira.designpatterns.state;

/**
 * Created by Ique on 19/02/17.
 */
public class StopState implements State{

    public void doAction(Contexto contexo) {
        System.out.println("Stoping state");
        contexo.setState(this);
    }

    public String toString(){
        return "Stop state";
    }
}
