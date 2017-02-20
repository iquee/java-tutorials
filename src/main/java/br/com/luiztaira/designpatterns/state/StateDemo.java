package br.com.luiztaira.designpatterns.state;

/**
 * Created by Ique on 19/02/17.
 */
public class StateDemo {

    public static void main(String[] args) {
        Contexto contexto = new Contexto();

        StartState startState = new StartState();
        startState.doAction(contexto);

        System.out.println(contexto.getState());

        StopState stop = new StopState();
        stop.doAction(contexto);

        System.out.println(contexto.getState());
    }
}
