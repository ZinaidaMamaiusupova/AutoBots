package com.autobots.java.bankApp;

public class CreditAccount extends BankAccount{

    private final double creditLimit = 1000;

    public CreditAccount(Client owner, Currency currency) {
        super(owner, currency);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        addTransactoin("Deposit", amount);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= balance + creditLimit) {
            balance -= amount;
            addTransactoin("Withdraw", amount);
            return true;
        }
        return false;
    }
}
