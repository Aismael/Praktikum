package com.bank.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by aisma on 11.04.2016.
 */
@Entity
public class Statement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
     Date date;
     float balance;
    @PrePersist
     void initiateDate(){
        date=new Date();
    }
}
