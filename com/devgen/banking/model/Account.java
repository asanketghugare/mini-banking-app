package com.devgen.banking.model;

public abstract class Account {

    private long accountNo;
    private double balance;
    private AccountType accountType;

    public Account(long accountNo, double balance, AccountType accountType) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.accountType= accountType;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }
}
