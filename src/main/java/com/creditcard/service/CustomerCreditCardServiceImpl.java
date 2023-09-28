package com.creditcard.service;

import com.creditcard.repositories.CustomerCreditCardRepository;

import javax.transaction.TransactionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creditcard.entities.CustomerCreditCard;

@Service
public class CustomerCreditCardServiceImpl implements CustomerCreditCardService{
	

	@Autowired
	@TransactionScoped
	CustomerCreditCardRepository customerCreditCardRepo;

	@Override
	public CustomerCreditCard addCustomerCreditCard(CustomerCreditCard customercreditcard) {
		return customerCreditCardRepo.save(customercreditcard);
	}

	@Override
	public CustomerCreditCard getCustomerCreditCardByNumber(Integer customercreditcardNumber) {
		return customerCreditCardRepo.getBynumber(customercreditcardNumber);
	}

	@Override
	public CustomerCreditCard getCustomerCreditCard(CustomerCreditCard customercreditcard) {
		return customerCreditCardRepo.findAll(customercreditcard);
	}

	@Override
	public CustomerCreditCard getCustomerCreditCard() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
