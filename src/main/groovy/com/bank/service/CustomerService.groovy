package com.bank.service

import com.bank.domain.Customer
import com.bank.domain.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired

import javax.transaction.Transactional;

/**
 * Created by aisma on 11.04.2016.
 */
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    void create(String firstname,String surename){
        customerRepository.save(new Customer(firstname: firstname,surename: surename))
    }
    @Transactional
    void read(int id){
        customerRepository.findOne(id)
    }
    @Transactional
    void update(Customer customer){
        customerRepository.save(customer)
    }
    @Transactional
    void delete(Customer customer){
        customerRepository.delete(customer)
    }
}
