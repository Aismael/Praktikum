package com.bank.domain.repository;

import com.bank.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aisma on 13.04.2016.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
