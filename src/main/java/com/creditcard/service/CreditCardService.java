package com.creditcard.service;

import java.util.List;

import com.creditcard.entities.CreditCard;
import com.creditcard.entities.CustomerCreditCard;


public interface CreditCardService {
	

	List<CreditCard> getCreditCardList();

	CreditCard addCreditCard(CreditCard creditcard);

	CreditCard getCreditCardByName(String cardName);

	CreditCard getCreditCardById(Integer creditcardId);


}
