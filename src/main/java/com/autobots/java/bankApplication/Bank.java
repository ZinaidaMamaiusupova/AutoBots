package com.autobots.java.bankApplication;

public interface Bank {

    double getBalance();// получить баланс, вывести
    void deposit(double amount); // пополнение счета
    void withDraw(double amount);// списание со счета

    static void transferFunds (Bank sender, Bank recipient, double transferAmount){
        sender.withDraw(transferAmount);
        recipient.deposit(transferAmount);
    }
}
