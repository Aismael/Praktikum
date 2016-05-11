package com.bank.domain.Account;

import javax.persistence.Entity;

/**
 * Created by aisma on 11.04.2016.
 */
@Entity
public class FlexibleSavingsAccount extends Account {
    public FlexibleSavingsAccount(){
        this.setInterestRate(4.25f);

    }
}
