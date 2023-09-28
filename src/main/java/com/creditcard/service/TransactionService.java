package com.creditcard.service;

import com.creditcard.entities.Transaction;

public interface TransactionService {

	Transaction addTransaction(Transaction transaction);

	Transaction getTransactionById(Integer transactionId);

	Transaction getAllTransactionById(Integer transactionId);
	
	Transaction getAllTransactionById1(Integer creditcardnumber);

}
