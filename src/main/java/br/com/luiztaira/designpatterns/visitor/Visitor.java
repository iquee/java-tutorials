package br.com.luiztaira.designpatterns.visitor;

import br.com.luiztaira.designpatterns.interpreter.Minus;
import br.com.luiztaira.designpatterns.interpreter.Number;
import br.com.luiztaira.designpatterns.interpreter.Plus;

public interface Visitor {

    public void printPlus(Plus plus);

    public void printMinus(Minus minus);

    public void printNumber(Number number);
}
