package com.devgen.banking.model;

public class SavingAccount extends Account {

    public SavingAccount(long accountNO, double balance){

        super(accountNO,balance ,AccountType.SAVING);
    }
}
