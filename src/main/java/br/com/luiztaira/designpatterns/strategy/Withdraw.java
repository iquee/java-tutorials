package br.com.luiztaira.designpatterns.strategy;

public class Withdraw implements BankTransaction {

    public void doTransaction(Account account, double value) {
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Withdraw: " + value);
        account.setBalance(account.getBalance() - value);
        System.out.println("New balance: " + account.getBalance());
    }
}
