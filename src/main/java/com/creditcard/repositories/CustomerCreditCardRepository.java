package com.creditcard.repositories;

import org.springframework.stereotype.Repository;

import com.creditcard.entities.CustomerCreditCard;

@Repository
public interface CustomerCreditCardRepository {



	CustomerCreditCard getBynumber(Integer customercreditcardNumber);

	CustomerCreditCard save(CustomerCreditCard customercreditcard);

	CustomerCreditCard findAll(CustomerCreditCard customercreditcard);

}
