package com.bank.domain;

import com.bank.domain.Account.Account;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by aisma on 11.04.2016.
 */
@Entity
public class Customer {
    String firstname;
    String surename;
    @Id
    @GeneratedValue
     int id;
    @ManyToMany(mappedBy="customers")
     Collection<Bank> banks = new ArrayList<Bank>();
    @OneToOne(cascade = CascadeType.ALL)
     Contact contact;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
     Collection<Account> accounts = new ArrayList<Account>();


}
