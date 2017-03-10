package br.com.luiztaira.designpatterns.interpreter;

public class DemoInterpreter {

    public static void main(String[] args) {
        Expression plus = new Plus(new Number(10), new Number(20));
        System.out.println(plus.check());

        Expression minus = new Minus(new Plus(new Number(20), new Number(40)), new Minus(new Number(10), new Number(15)));
        System.out.println(minus.check());
    }
}
