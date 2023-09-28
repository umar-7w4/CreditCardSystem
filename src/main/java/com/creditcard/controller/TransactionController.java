package com.creditcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.creditcard.entities.Transaction;
import com.creditcard.entities.User;
import com.creditcard.service.TransactionService;
import com.creditcard.service.UserService;

@RestController
@RequestMapping("/api/transaction")
public class TransactionController {

	@Autowired
	TransactionService transactionService;
	
	 @PostMapping("/addtransaction")
	    public Transaction addTransaction(@RequestBody Transaction transaction){
	        return transactionService.addTransaction(transaction);
	    }
	 
	
	@GetMapping("/gettransaction/{id}")
	public ResponseEntity<Transaction> getTransaction(
			@PathVariable("transactionId")Integer transactionId){
		Transaction transaction= transactionService.getTransactionById(transactionId);
		if(transaction==null) {
			return new ResponseEntity("Sorry! transaction not found!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Transaction>(transaction, HttpStatus.OK);
	}
	
	@GetMapping("/viewalltransaction/{id}")
	public ResponseEntity<Transaction> getAllTransaction(
			@PathVariable("transactionId")Integer transactionId){
		Transaction transaction= transactionService.getAllTransactionById(transactionId);
		if(transaction==null) {
			return new ResponseEntity("Sorry! transaction not found!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Transaction>(transaction, HttpStatus.OK);
	}
	
	@GetMapping("/viewalltransaction/{number}")
	public ResponseEntity<Transaction> getAllTransaction1(
			@PathVariable("creditcardNumber")Integer creditcardNumber){
		Transaction transaction= transactionService.getAllTransactionById(creditcardNumber);
		if(transaction==null) {
			return new ResponseEntity("Sorry! transaction not found!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Transaction>(transaction, HttpStatus.OK);
	}
}
