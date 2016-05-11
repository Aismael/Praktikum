package com.bank.domain.repository;

import com.bank.domain.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by aisma on 13.04.2016.
 */
@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
    List<Bank> findByName(String name);
}
