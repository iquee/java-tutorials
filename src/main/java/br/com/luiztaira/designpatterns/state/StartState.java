package br.com.luiztaira.designpatterns.state;

/**
 * Class that represent a started state.txt
 */
public class StartState implements State {
    public void doAction(Context contex) {
        System.out.println("Starting state.txt...");
        contex.setState(this);
    }

    public String toString(){
        return "State started";
    }
}
