
package com.autobots.java.bankApplication;

import java.util.*;

public abstract class BankBase implements Bank {

    private String bankName;
    private long accountNumber;
    private long routingNumber;

    public static Set<BankBase> allBankRecords = new HashSet<>();
    //создать отдельную базу данных для каждого банка
    //выводить сколько клиентов в каждом банке, группировать

    public static Map<String, Set<BankBase>> groupByBank = new HashMap<>();

    public BankBase(long accountNumber, long routingNumber, String bankName) {
        if (Long.toString(accountNumber).length() != 12) {
            throw new IllegalArgumentException("Account number must be 12 digits");
        } else if (Long.toString(routingNumber).length() != 9) {
            throw new IllegalArgumentException("Routing number must be 9 digits");
        } else {
            this.accountNumber = accountNumber;
            this.routingNumber = routingNumber;
            this.bankName = bankName;
        }
    }

    public static Set<BankBase> addToAllBankRecords(BankBase bank) throws Exception {
        for (BankBase bankBase : allBankRecords) {
            if (bankBase.getAccountNumber() == bank.getAccountNumber()) {
                throw new Exception(bank.getAccountNumber() + ": account number already exist");
            }
            if (bankBase.getRoutingNumber() == bank.getRoutingNumber()) {
                throw new Exception(bank.getAccountNumber() + ": routing number already exist");
            }
        }
        allBankRecords.add(bank);
        return allBankRecords;
    }

    public static void addToGroupByBank(BankBase bank){
        groupByBank.computeIfAbsent(bank.getBankName(), k -> new HashSet<>()).add(bank);
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(long routingNumber) {
        this.routingNumber = routingNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BankBase bankBase = (BankBase) o;
        return accountNumber == bankBase.accountNumber && routingNumber == bankBase.routingNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, routingNumber);
    }

    @Override
    public String toString() {
        return "BankBase: " + bankName + " accountNumber = " + accountNumber +
                ", routingNumber = " + routingNumber;
    }
}


