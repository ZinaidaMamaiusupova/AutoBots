package com.autobots.java.bankApp;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class BankProApp {

    private static final Map<String, Client> clients = new HashMap<>();

    public static void main(String[] args) {

        Client asan = new Client("Asan Usenov", "123");

        DepositAccount asanDepositAccount = new DepositAccount(asan, Currency.USD);
        CreditAccount asanCreditAccount = new CreditAccount(asan, Currency.EUR);


        asan.addAccount(asanDepositAccount);
        asan.addAccount(asanCreditAccount);

        clients.put(asan.getClientID(), asan);


    }
}
