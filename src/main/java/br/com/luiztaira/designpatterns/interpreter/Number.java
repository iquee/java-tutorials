package br.com.luiztaira.designpatterns.interpreter;

import br.com.luiztaira.designpatterns.visitor.Visitor;

public class Number implements Expression{

    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int check() {
        return this.number;
    }

    public void accept(Visitor visitor) {
        visitor.printNumber(this);
    }

    public int getNumber() {
        return this.number;
    }
}
