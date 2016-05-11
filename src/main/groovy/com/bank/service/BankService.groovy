package com.bank.service

import com.bank.domain.Bank
import com.bank.domain.repository.BankRepository
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import javax.transaction.Transactional;

/**
 * Created by aisma on 11.04.2016.
 */
@Service
public class BankService {
    @Autowired
    private BankRepository bankRepository;
    @Transactional
    def create(String name){
        bankRepository.save(new Bank(name: name))
    }
    @Transactional
    def read(int id){
        bankRepository.getOne(id)
    }
    @Transactional
    def update(Bank bank){
        bankRepository.save(bank)
    }
    @Transactional
    def delete(Bank bank){
        bankRepository.delete(bank)
    }
}
