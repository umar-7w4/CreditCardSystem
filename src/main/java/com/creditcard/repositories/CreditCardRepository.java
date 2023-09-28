package com.creditcard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.creditcard.entities.CreditCard;
import com.creditcard.entities.CustomerCreditCard;


@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Integer>{
    //@Query("select c from CreditCard c where c.cardName=?1")
	CreditCard getByName(String cardName);
	



}
