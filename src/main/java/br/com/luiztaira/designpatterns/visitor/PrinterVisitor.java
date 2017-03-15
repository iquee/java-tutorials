package br.com.luiztaira.designpatterns.visitor;

import br.com.luiztaira.designpatterns.interpreter.Minus;
import br.com.luiztaira.designpatterns.interpreter.Number;
import br.com.luiztaira.designpatterns.interpreter.Plus;

public class PrinterVisitor implements Visitor {

    public void printPlus(Plus plus) {
        System.out.print("(");

        plus.getLeft().accept(this);
        System.out.print(" + ");
        plus.getRight().accept(this);

        System.out.print(")");

    }

    public void printMinus(Minus minus) {

        System.out.print("(");

        minus.getLeft().accept(this);
        System.out.print(" - ");
        minus.getRight().accept(this);

        System.out.print(")");

    }

    public void printNumber(Number number) {
        System.out.print(number.getNumber());
    }
}
