package br.com.luiztaira.designpatterns.strategy;

public interface BankTransaction {

    public void doTransaction(Account account,  double value);
}
