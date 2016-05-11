package com.bank.domain.Account;

import javax.persistence.Entity;

/**
 * Created by aisma on 11.04.2016.
 */
@Entity
public class CheckingAccount extends Account {
    public CheckingAccount(){
        this.setInterestRate(1);

    }
}
