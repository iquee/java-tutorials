package br.com.luiztaira.designpatterns.state;

/**
 * Class that represent a stopped state
 */
public class StopState implements State{

    public void doAction(Context contex) {
        System.out.println("Stoping state...");
        contex.setState(this);
    }

    public String toString(){
        return "State stopped";
    }
}
