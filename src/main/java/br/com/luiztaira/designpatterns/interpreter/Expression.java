package br.com.luiztaira.designpatterns.interpreter;

import br.com.luiztaira.designpatterns.visitor.Visitor;

public interface Expression  {

    public int check();
    public void accept(Visitor visitor);
}
