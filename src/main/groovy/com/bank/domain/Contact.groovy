package com.bank.domain;

import javax.persistence.*;

/**
 * Created by aisma on 11.04.2016.
 */
@Entity
public class Contact {
    String phone;
    String mobilePhone;
    String telefax;
    String email;
    @Id
    @GeneratedValue
     int id;

    @OneToOne(cascade = CascadeType.ALL)
    Address address;



}
