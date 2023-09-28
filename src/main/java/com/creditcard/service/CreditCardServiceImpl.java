package com.creditcard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.creditcard.entities.CreditCard;
import com.creditcard.entities.CustomerCreditCard;
import com.creditcard.repositories.CreditCardRepository;
@Service
public class CreditCardServiceImpl implements CreditCardService {

	@Autowired
	
	 CreditCardRepository creditCardRepo;
	
	
	@Override
	public List<CreditCard> getCreditCardList() {
		return creditCardRepo.findAll();
	}

	@Override
	public CreditCard addCreditCard(CreditCard creditcard) {
		return creditCardRepo.save(creditcard);
	}

	@Override
	public CreditCard getCreditCardByName(String cardName) {
		return creditCardRepo.getByName(cardName);
	}

	@Override
	public CreditCard getCreditCardById(Integer creditcardId) {
		return creditCardRepo.getById(creditcardId);
	}
	



}
