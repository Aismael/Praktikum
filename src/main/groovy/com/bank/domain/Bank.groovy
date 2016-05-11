package com.bank.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by aisma on 11.04.2016.
 */
@Entity
class Bank {
    @Column(unique = true)
    String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    int sortCode;


    @ManyToMany(cascade =  [CascadeType.MERGE,CascadeType.REFRESH])

    @JoinTable(name = "BANK_ADDRESS",
            joinColumns = [
                    @JoinColumn(name = "BANK_SORTCODE")],
            inverseJoinColumns = [
                    @JoinColumn(name = "ADDRESS_ADDID")]
    )
     List<Address> addresses = new ArrayList<Address>();
    @ManyToMany
     Collection<Customer> customers = new ArrayList<Customer>();
    
}
