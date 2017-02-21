package br.com.luiztaira.designpatterns.state;

/**
 * Class that represent a stopped state.txt
 */
public class StopState implements State{

    public void doAction(Context contex) {
        System.out.println("Stoping state.txt...");
        contex.setState(this);
    }

    public String toString(){
        return "State stopped";
    }
}
