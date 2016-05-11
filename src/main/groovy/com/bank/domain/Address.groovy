package com.bank.domain

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by aisma on 11.04.2016.
 */
@Entity

public class Address {
    @Id
    @GeneratedValue
     int id;
    String street;
    String houseNumber;
    String zipCode;
    String city;

    @OneToOne(mappedBy = "address")
    Contact contact;

}
