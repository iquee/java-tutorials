package br.com.luiztaira.designpatterns.interpreter;

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
}
