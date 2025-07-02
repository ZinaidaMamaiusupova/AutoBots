package com.autobots.java.bankApplication;

public class BankDemo {
    public static void main(String[] args) throws Exception {

        MBank aliyaMBank = new MBank(123456789123L, 444444444, "MBank");
        MBank aminaMBank = new MBank(132446576874L, 111111111, "MBank");
        MBank kunduzMBank = new MBank(212446576874L, 221111111, "MBank");
        MBank elviraMBank = new MBank(312446576874L, 311111111, "MBank");
        MBank zaviraMBank = new MBank(412446576874L, 411111111, "MBank");


//        System.out.println(aliyaMBank.getBalance());
//        aliyaMBank.deposit(200000);
//        System.out.println(aliyaMBank.getBalance());
//
        OptimaBank ulugbekOptima = new OptimaBank(123456789122L, 555555555, "OptimaBank");
//        System.out.println(ulugbekOptima.getBalance());
//        System.out.println("__________");
//
//        Bank.transferFunds(aliyaMBank, ulugbekOptima, 500);
//        System.out.println(aliyaMBank.getBalance());
//        System.out.println(ulugbekOptima.getBalance());
//
        DemirBank zinaidaDemir = new DemirBank(123674566832L, 666666666, "DemirBank");
//        //Bank.transferFunds(zinaidaDemir, ulugbekOptima, 1000);
//        System.out.println(zinaidaDemir.getBalance());
//        //zinaidaDemir.deposit(600000);
//        zinaidaDemir.withDraw(50);
//
//        BankBase.allBankRecords.stream().filter(n -> n.getBalance() > 100).forEach(System.out::println);
//
//        double allSumOfBanks = BankBase.allBankRecords.stream().mapToDouble(Bank::getBalance).sum();
//        System.out.println(allSumOfBanks);


        System.out.println("__________________");
        BankBase.allBankRecords.stream().forEach(System.out::println);

        System.out.println("\t\t\tКлиенты по банкам");
        BankBase.groupByBank.forEach((bankName, clients) -> {
            System.out.println("\nБанк: " + bankName);
            clients.forEach(System.out::println);
        });

    }
}
