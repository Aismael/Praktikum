package com.bank.domain.Account

import com.bank.domain.Bank
import com.bank.domain.Customer
import com.bank.domain.Statement

import javax.persistence.*
import java.util.Collection

/**
 * Created by aisma on 11.04.2016.
 */
@Entity
public class Account {
    @Id
    @GeneratedValue
     int accountNumber
     float balance//TODO Money.class
     float interestRate
     long interestPeriod
    @ManyToOne
     Bank bank
    @ManyToOne (cascade=CascadeType.ALL)
     Customer customer
    @OneToMany(cascade = CascadeType.ALL)
     Collection<Statement> statements

}
