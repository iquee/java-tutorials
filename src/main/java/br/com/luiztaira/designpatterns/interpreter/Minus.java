package br.com.luiztaira.designpatterns.interpreter;

import br.com.luiztaira.designpatterns.visitor.Visitor;

public class Minus implements Expression {

    private Expression left;
    private Expression right;

    public Minus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int check() {
        int leftResult = left.check();
        int rightResult = right.check();

        return leftResult - rightResult;
    }

    public void accept(Visitor visitor) {
        visitor.printMinus(this);
    }

    public Expression getLeft() {
        return this.left;
    }

    public Expression getRight() {
        return this.right;
    }
}
