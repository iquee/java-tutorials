package br.com.luiztaira.designpatterns.strategy;

public class DemoTransactionStrategy {
    public static void main(String[] args) {
        Account myAccount = new Account(500);

        BankTransaction transaction = new Withdraw();
        transaction.doTransaction(myAccount, 100);

        transaction = new Deposit();
        transaction.doTransaction(myAccount, 400);
    }
}
