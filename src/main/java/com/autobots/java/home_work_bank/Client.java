package com.autobots.java.home_work_bank;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Client {
    // Client — Класс клиента банка
    //Каждый клиент должен иметь:
    //Полное имя
    //Уникальный clientId (генерировать через UUID)
    //PIN-код (строка из 4 цифр)
    //Список всех банковских счетов клиента (List<BankAccount>)
    //Методы:
    //boolean authenticate(String pin) — сверяет введённый PIN
    //void addAccount(BankAccount account)
    //Геттеры для всех полей

    private String fullName;
    private UUID clientID;
    private int pinCode;
    private List<BankAccount> listOfBankAccounts;


    public Client(String fullName,  int pinCode) {
        this.fullName = fullName;
        this.clientID = UUID.randomUUID();
        this.pinCode = pinCode;
        this.listOfBankAccounts = new ArrayList<>();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UUID getClientID() {
        return clientID;
    }

    public void setClientID(UUID clientID) {
        this.clientID = clientID;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public List<BankAccount> getListOfBankAccounts() {
        return listOfBankAccounts;
    }

    public void setListOfBankAccounts(List<BankAccount> listOfBankAccounts) {
        this.listOfBankAccounts = listOfBankAccounts;
    }
}
