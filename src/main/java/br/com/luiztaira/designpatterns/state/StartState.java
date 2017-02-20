package br.com.luiztaira.designpatterns.state;

/**
 * Class that represent a started state
 */
public class StartState implements State {
    public void doAction(Context contex) {
        System.out.println("Starting state...");
        contex.setState(this);
    }

    public String toString(){
        return "State started";
    }
}
