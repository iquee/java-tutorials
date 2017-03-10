package br.com.luiztaira.designpatterns.memento;

public class DemoMemento {

    public static void main(String[] args) {
        Timeline timeline = new Timeline();

        Originator originator = new Originator();
        originator.setState("State1");
        System.out.println("");
        originator.setState("State2");
        timeline.addContract(originator.saveContract());
        System.out.println("");
        originator.setState("State3");
        timeline.addContract(originator.saveContract());
        System.out.println("");
        originator.setState("State4");

        System.out.println("");

        int postion = 1;
        System.out.println("Return to position: " + postion);
        originator.restoreState(timeline.getContract(postion));

    }
}
