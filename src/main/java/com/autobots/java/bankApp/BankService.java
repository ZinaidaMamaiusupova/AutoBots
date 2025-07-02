package com.autobots.java.bankApp;

public class BankService {

    public static boolean transfer(BankAccount from, BankAccount to, double amount) {
        if (from.withdraw(amount)) {

            double convertedSum = ExchangeRate.convert(amount, from.getCurrency(), to.getCurrency());
            to.deposit(convertedSum);
            from.addTransactoin("Transfer out", amount);
            to.addTransactoin("Transfer in", convertedSum);
            return true;
        }
        return false;
    }
}
