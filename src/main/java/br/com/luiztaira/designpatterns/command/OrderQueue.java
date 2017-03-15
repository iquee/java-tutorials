package br.com.luiztaira.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class OrderQueue {

    private List<Command> orderQueue;

    public OrderQueue() {
        this.orderQueue = new ArrayList<Command>();
    }

    public void addCommand(Command command){
        this.orderQueue.add(command);
    }

    public void process(){
        for (Command command: this.orderQueue) {
            command.execute();
        }
    }
}
