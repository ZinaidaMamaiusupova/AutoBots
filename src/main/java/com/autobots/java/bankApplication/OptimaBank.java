package com.autobots.java.bankApplication;

import java.util.Set;

public class OptimaBank extends BankBase{

    private double balance;

    public OptimaBank(long accountNumber, long routingNumber, String bankName) throws Exception {
        super(accountNumber, routingNumber, bankName);
        Set<BankBase> addedSet = addToAllBankRecords(this);
        addToGroupByBank(this);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if(amount < 0 || amount > 300000){
            throw new IllegalArgumentException("Invalid amount. Can not be deposit");
        }
        balance += amount;
    }

    @Override
    public void withDraw(double amount) {
        if(amount < 0 || amount > 250000){
            throw new IllegalArgumentException("Invalid amount. Can not be withDraw");
        } else {
            if(amount > balance){
                throw new IllegalArgumentException("Insufficient funds");
            } else {
                balance -= amount;
            }
        }
    }
}
