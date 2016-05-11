package com.bank.service;

import com.bank.domain.Account.Account;
import com.bank.domain.Account.CheckingAccount;
import com.bank.domain.Account.FlexibleSavingsAccount;
import com.bank.domain.Account.SavingsAccount;
import com.bank.domain.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

/**
 * Created by aisma on 11.04.2016.
 */

public class AccountService {
    @Autowired
    private AccountRepository accountRepository;


    @Transactional
    def create(Account account) {
        account.setInterestPeriod(1)
        account.setBalance(0)
        accountRepository.save(account)
    }

    def createSavingsAccount() {
        create(new SavingsAccount())
    }

    def createCheckingAccount() {
        create(new CheckingAccount())

    }

    def createFlexibleSavingsAccount() {
        create(new FlexibleSavingsAccount())
    }

    @Transactional
    def read(int id) {
        accountRepository.getOne(id)
    }

    @Transactional
    def update(Account account) {
        accountRepository.save(account)

    }

    @Transactional
    def Delete(int id) {
        accountRepository.delete(accountRepository.getOne(id))
    }
}
