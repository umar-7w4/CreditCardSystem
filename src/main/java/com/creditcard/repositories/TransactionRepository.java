package com.creditcard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.creditcard.entities.Transaction;
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
