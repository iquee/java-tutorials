package br.com.luiztaira.designpatterns.visitor;

import br.com.luiztaira.designpatterns.interpreter.Expression;
import br.com.luiztaira.designpatterns.interpreter.Minus;
import br.com.luiztaira.designpatterns.interpreter.Number;
import br.com.luiztaira.designpatterns.interpreter.Plus;

public class DemoVisitor {

    public static void main(String[] args) {
        Visitor visitor = new PrinterVisitor();

        Expression plus = new Plus(new Number(10), new Number(20));
        Expression minus = new Minus(new Plus(new Number(20), new Number(40)), new Minus(new Number(30), new Number(15)));

        Expression expression = new Plus(plus, minus);
        System.out.println(expression.check());
        expression.accept(visitor);
    }
}
