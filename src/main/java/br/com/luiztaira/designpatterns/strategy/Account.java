package br.com.luiztaira.designpatterns.strategy;

public class Account {

    double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
}
