package com.creditcard.service;


import com.creditcard.entities.CustomerCreditCard;

public interface CustomerCreditCardService {

	CustomerCreditCard addCustomerCreditCard(CustomerCreditCard customercreditcard);

	CustomerCreditCard getCustomerCreditCardByNumber(Integer customercreditcardNumber);


	CustomerCreditCard getCustomerCreditCard();

	CustomerCreditCard getCustomerCreditCard(CustomerCreditCard customercreditcard);

}
