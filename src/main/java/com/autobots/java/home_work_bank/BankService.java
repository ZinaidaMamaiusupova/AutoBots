package com.autobots.java.home_work_bank;

public class BankService {
    public static boolean transfer(BankAccount from, BankAccount to, double amount) {
        double convertedAmount = ExchangeRate.convert(amount, from.getCurrency(), to.getCurrency());

        if (from.withdraw(amount)) {
            to.deposit(convertedAmount);
            from.addTransaction("TRANSFER", amount);
            to.addTransaction("TRANSFER", convertedAmount);
            return true;
        }
        return false;
    }
}
