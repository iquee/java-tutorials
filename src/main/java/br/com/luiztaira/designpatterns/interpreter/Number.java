package br.com.luiztaira.designpatterns.interpreter;

public class Number implements Expression{

    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int check() {
        return this.number;
    }
}
