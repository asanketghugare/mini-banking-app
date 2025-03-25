package com.devgen.banking.model;

public class CurrentAccount extends Account {

    public CurrentAccount(long accountNo, double balance){
        super(accountNo, balance, AccountType.CURRENT);
    }
}
