package com.devgen.banking.service;

import com.devgen.banking.model.Account;
import com.devgen.banking.model.AccountType;
import com.devgen.banking.model.CurrentAccount;
import com.devgen.banking.model.SavingAccount;

import java.util.HashMap;
import java.util.Map;

public class AccountService {

    Map<Long, Account> accountMap = new HashMap<>();
    long accountNumber = 1L;

    public Long createAccount(double balance, AccountType accountType){

        if (accountType == AccountType.SAVING){
            SavingAccount account = new SavingAccount(accountNumber, balance);
            accountMap.put(accountNumber, account);
        } else if (accountType == AccountType.CURRENT) {
            CurrentAccount account = new CurrentAccount(accountNumber, balance);
            accountMap.put(accountNumber, account);
        }
         accountNumber++;

        return accountNumber - 1;

    }

    public Account getAccountNo(Long accountNumber){
        return accountMap.get(accountNumber);
    }
}
