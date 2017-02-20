package br.com.luiztaira.designpatterns.state;

/**
 * Run Design Pattern State
 */
public class StateDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState());

        StopState stop = new StopState();
        stop.doAction(context);

        System.out.println(context.getState());
    }
}
