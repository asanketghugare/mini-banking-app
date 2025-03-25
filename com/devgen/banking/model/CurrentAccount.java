package com.devgen.banking.model;

public class CurrentAccount extends Account {

    private final double overdraftLimit = 500;

    public CurrentAccount(long accountNo, double balance){
        super(accountNo, balance, AccountType.CURRENT);
    }

    public double getOverdraftLimit(){
        return overdraftLimit;

    }
}

