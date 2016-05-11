package com.bank.domain.repository;

import com.bank.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aisma on 13.04.2016.
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
