package com.bank.service;

import com.bank.domain.Account.Account;

/**
 * Created by aisma on 11.04.2016.
 */
public class FinanceService {
    private AccountService accountService
    FinanceService(){
        accountService=new AccountService();
    }
    def withdrawI={Account a,int am->a.setBalance(a.getBalance()+am);accountService.update(a) }
    def depositI={Account a,int am->a.setBalance(a.getBalance()-am);accountService.update(a) }

    def withdraw(Account destination,int ammount){

        withdrawI(accountService.read(destination.getAccountNumber()),ammount);
    }
    def deposit(Account destination,int ammount){

        depositI(accountService.read(destination.getAccountNumber()),ammount);

    }
    def bankTransfer(Account destination,Account target,int ammount){
        withdrawI(accountService.read(destination.getAccountNumber()),ammount)
        depositI(accountService.read(target.getAccountNumber()).balance,ammount)

    }
}
