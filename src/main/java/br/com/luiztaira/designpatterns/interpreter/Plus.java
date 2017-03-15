package br.com.luiztaira.designpatterns.interpreter;

import br.com.luiztaira.designpatterns.visitor.Visitor;

public class Plus implements Expression {

    private Expression left;
    private Expression right;

    public Plus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int check() {
        int leftResult = left.check();
        int rightResult = right.check();

        return leftResult + rightResult;
    }

    public void accept(Visitor visitor) {
        visitor.printPlus(this);
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}
